package com.spinhighq.skart.utils;

import java.util.HashMap;
import java.util.Map;

public class RestResponse {
    private long identifier;
    private String entityType;
    private String action;

    private static final Map<String, String> httpVerbMesageMap;
    static {
        httpVerbMesageMap = new HashMap<String, String>();
        httpVerbMesageMap.put("POST", "Successfully Created");
        httpVerbMesageMap.put("PUT", "Successfully Updated");
        httpVerbMesageMap.put("DELETE", "Successfully Deleted");
    }

    public RestResponse() {
    }

    public RestResponse(long id, String entityType, String httpVerb) {
        this.identifier = id;
        this.entityType = entityType;
        this.action = httpVerbMesageMap.get(httpVerb);
    }

    
    public long getIdentifier() {
        return identifier;
    }

    public void setIdentifier(long identifier) {
        this.identifier = identifier;
    }

    public String getEntityType() {
        return entityType;
    }
    public String getAction() {
        return action;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }
    public void setAction(String action) {
        this.action = action;
    }

}
