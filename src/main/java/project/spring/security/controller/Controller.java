package project.spring.security.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import project.spring.security.model.JsonResponse;

@RestController
public class Controller {

    @GetMapping("/admin")
    public ResponseEntity<JsonResponse> admin() {
        return new ResponseEntity<>(new JsonResponse("Role_Admin"), HttpStatus.ACCEPTED);
    }

    @GetMapping("/user")
    public ResponseEntity<JsonResponse> clown() {
        return new ResponseEntity<>(new JsonResponse("Role_User"), HttpStatus.ACCEPTED);
    }

    @GetMapping("/info")
    public ResponseEntity<JsonResponse> info(){
        return new ResponseEntity<>(new JsonResponse("Role_User or Role_Admin"), HttpStatus.ACCEPTED);
    }

    @GetMapping("/hr")
    public ResponseEntity<JsonResponse> dog(){
        return new ResponseEntity<>(new JsonResponse("Role_HR"), HttpStatus.ACCEPTED);
    }

    @GetMapping("/vacancies")
    public ResponseEntity<JsonResponse> cat(){
        return new ResponseEntity<>(new JsonResponse("Role_Admin or Role_User or Role_HR"), HttpStatus.ACCEPTED);
    }


}
