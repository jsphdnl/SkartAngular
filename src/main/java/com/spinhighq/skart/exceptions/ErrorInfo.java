package com.spinhighq.skart.exceptions;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * 
 * @author bharath
 *
 */
@JsonPropertyOrder({"timestamp","status","error","message","path"})
public class ErrorInfo {
            
    private long timestamp;
    private String error;
    private int status;
    private String message;
    private String path;
    
    public ErrorInfo(long timestamp, String error, int status, String message,
            String path) {
        this.timestamp = timestamp;
        this.error = error;
        this.status = status;
        this.message = message;
        this.path = path;
    }
    public long getTimestamp() {
        return timestamp;
    }
    public String getError() {
        return error;
    }
    public int getStatus() {
        return status;
    }
    public String getMessage() {
        return message;
    }
    public String getPath() {
        return path;
    }
    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
    public void setError(String error) {
        this.error = error;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public void setPath(String path) {
        this.path = path;
    }
    
    @Override
    public String toString() {
        return "ErrorInfo [timestamp=" + timestamp + ", error=" + error
                + ", status=" + status + ", message=" + message + ", path="
                + path + "]";
    }
    
}
