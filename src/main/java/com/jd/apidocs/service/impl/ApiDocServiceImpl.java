/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.apidocs.service.impl;

import com.jd.apidocs.dao.ApiDocMapper;
import com.jd.apidocs.dao.CategoryMapper;
import com.jd.apidocs.dao.RequestParameterMapper;
import com.jd.apidocs.dao.ResponseParameterMapper;
import com.jd.apidocs.domain.ApiDoc;
import com.jd.apidocs.domain.RequestParameter;
import com.jd.apidocs.domain.ResponseParameter;
import com.jd.apidocs.rest.response.ApiDocModel;
import com.jd.apidocs.service.ApiDocService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Administrator
 */
@Service
public class ApiDocServiceImpl implements ApiDocService {

    @Resource
    private CategoryMapper categoryMapper;

    @Resource
    private ApiDocMapper apiDocMapper;

    @Resource
    private RequestParameterMapper requestParameterMapper;

    @Resource
    private ResponseParameterMapper responseParameterMapper;

    @Override
    @Transactional
    public void addApiDoc(ApiDocModel model) {
        //保存这个apiddoc
        ApiDoc apiDoc = new ApiDoc();
        apiDoc.setCategoryId(model.getCategoryId());
        apiDoc.setName(model.getName());
        apiDoc.setDescription(model.getDescription());

        apiDocMapper.save(apiDoc);
        //保存参数信息
        for(RequestParameter request:model.getRequestParameters()){
            request.setApiId(apiDoc.getId());
            requestParameterMapper.save(request);
        }

        for(ResponseParameter response:model.getResponseParameters()){
            response.setApiId(apiDoc.getId());
            responseParameterMapper.save(response);
        }

    }

    @Override
    public List<ApiDocModel> findByPage() {
        return apiDocMapper.findByPage();
    }

    @Override
    public ApiDocModel findById(int id) {
        return apiDocMapper.findById(id);
    }

    
    public List<ApiDocModel> findByCategoryId(int categoryId){
        return apiDocMapper.findByCategoryId(categoryId);
    }
}
