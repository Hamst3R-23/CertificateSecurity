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

    @GetMapping("/clown")
    public ResponseEntity<JsonResponse> clown() {
        return new ResponseEntity<>(new JsonResponse("Role_Clown"), HttpStatus.ACCEPTED);
    }

    @GetMapping("/clownadmin")
    public ResponseEntity<JsonResponse> clownAndAdmin(){
        return new ResponseEntity<>(new JsonResponse("Role_Clown or Role_Admin"), HttpStatus.ACCEPTED);
    }

    @GetMapping("/dog")
    public ResponseEntity<JsonResponse> dog(){
        return new ResponseEntity<>(new JsonResponse("Role_Dog"), HttpStatus.ACCEPTED);
    }

    @GetMapping("/cat")
    public ResponseEntity<JsonResponse> cat(){
        return new ResponseEntity<>(new JsonResponse("Role_Cat"), HttpStatus.ACCEPTED);
    }


}
