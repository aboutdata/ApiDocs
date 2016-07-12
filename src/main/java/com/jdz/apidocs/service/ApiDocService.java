package com.jdz.apidocs.service;

import com.jdz.apidocs.rest.response.ApiDocModel;

import java.util.List;

/**
 *
 * @author Administrator
 */
public interface ApiDocService {

    public void addApiDoc(ApiDocModel model);

    public List<ApiDocModel> findByPage();

    public ApiDocModel findById(int id);

    public List<ApiDocModel> findByCategoryId(int categoryId);
}
