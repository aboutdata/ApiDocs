package com.jingji.apidocs.domain;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/3/16.
 */
public class ResponseParameter implements Serializable {

    private String apiId;// ID
    private String name;
    private String type;
    private String description;

    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
