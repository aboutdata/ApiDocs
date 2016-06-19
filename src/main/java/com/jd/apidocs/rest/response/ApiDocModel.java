/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.apidocs.rest.response;

import com.jd.apidocs.domain.RequestParameter;
import com.jd.apidocs.domain.ResponseParameter;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class ApiDocModel implements Serializable{

    private String id;// ID
    private String name;
    private int categoryId;
    private String description;

    private List<RequestParameter> requestParameters;
    private List<ResponseParameter> responseParameters;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<RequestParameter> getRequestParameters() {
        return requestParameters;
    }

    public void setRequestParameters(List<RequestParameter> requestParameters) {
        this.requestParameters = requestParameters;
    }

    public List<ResponseParameter> getResponseParameters() {
        return responseParameters;
    }

    public void setResponseParameters(List<ResponseParameter> responseParameters) {
        this.responseParameters = responseParameters;
    }

    @Override
    public String toString() {
        return "ApiDocModel{" + "id=" + id + ", name=" + name + ", categoryId=" + categoryId + ", description=" + description + ", requestParameters=" + requestParameters + ", responseParameters=" + responseParameters + '}';
    }
    
}
