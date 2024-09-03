package com.employee.employee_management;

import java.util.Date;

public class ErrorMessage {
    private int statusCode;
    private Date timeStamp;
    private String message;
    private String description;

    public ErrorMessage(int statusCode, Date timeStamp, String message, String description){
        this.statusCode = statusCode;
        this.timeStamp = timeStamp;
        this.message = message;
        this.description = description;
    }
    public int getStatusCode(){
        return this.statusCode;
    }
    public Date getTimeStamp(){
        return this.timeStamp;
    }
    public String getMessage(){
        return this.message;
    }
    public String getDescription(){
        return this.description;
    }
}
