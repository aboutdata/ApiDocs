package com.jdz.apidocs.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2016/3/16.
 */
public class ApiDoc implements Serializable {

    private String id;// ID
    private String name;
    private int categoryId;
    private String description;

    private Date createDate;// 创建日期
    private Date modifyDate;// 修改日期

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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
}
