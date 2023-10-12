package project.spring.security.model;

public class ExceptionResponse {

    private String exception;

    public ExceptionResponse(String exception) {
        this.exception = exception;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

}
