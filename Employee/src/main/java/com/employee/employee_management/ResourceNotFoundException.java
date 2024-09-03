package com.employee.employee_management;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// @ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    // private String message;
    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(String message){
        // this.message = message;
        super(message);
    }

    // public String getMessage(){
    //     return message;
    // }

    // public void setMessage(String message){
    //     this.message = message;
    // }
    
}
