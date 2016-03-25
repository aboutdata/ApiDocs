/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jingji.apidocs.dao;

import com.jingji.apidocs.domain.ApiDoc;
import com.jingji.apidocs.rest.response.ApiDocModel;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface ApiDocMapper {

    public void save(ApiDoc apiDoc);

    public List<ApiDocModel> findByPage();

    public ApiDocModel findById(int id);

}
