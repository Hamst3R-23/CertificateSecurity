package project.spring.security.model;

public class JsonResponse {

    private String response;

    public JsonResponse(String message){
       this.response = message;
    }

    public String getResponse(){
        return response;
    }

    public void setResponse(String message){
        this.response = message;
    }

}
