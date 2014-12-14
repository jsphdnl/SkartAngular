package com.spinhighq.skart.exceptions;

/**
 * 
 * @author bharath
 *
 */
public class NotFoundException extends RuntimeException{

    /* Genereic Message should be moved to message.properties */
    private String message = "Cannot find ";    
    private static final long serialVersionUID = 1L;
    
    
    public NotFoundException(String msg){
        this.message += msg;
    }


    public String getMessage() {
        return message;
    }


    public void setMessage(String message) {
        this.message = message;
    }
    
        
}
