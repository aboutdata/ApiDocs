/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jingji.apidocs.service.impl;

import com.jingji.apidocs.dao.ApiDocMapper;
import com.jingji.apidocs.dao.CategoryMapper;
import com.jingji.apidocs.dao.RequestParameterMapper;
import com.jingji.apidocs.dao.ResponseParameterMapper;
import com.jingji.apidocs.domain.ApiDoc;
import com.jingji.apidocs.domain.RequestParameter;
import com.jingji.apidocs.domain.ResponseParameter;
import com.jingji.apidocs.rest.response.ApiDocModel;
import com.jingji.apidocs.service.ApiDocService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

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
    public void addApiDoc(ApiDocModel model) {
        //保存这个apiddoc 
        ApiDoc apiDoc = new ApiDoc();
        apiDoc.setCategoryId(2);
        apiDoc.setName("接口名称");
        apiDoc.setDescription("描述");

        apiDocMapper.save(apiDoc);
        //保存参数信息
        RequestParameter request = new RequestParameter();
        request.setApiId(apiDoc.getId());
        request.setName("用户名");
        request.setType("String");
        request.setDescription("参数描述");

        requestParameterMapper.save(request);

        ResponseParameter response = new ResponseParameter();
        response.setApiId(apiDoc.getId());
        response.setName("用户名");
        response.setType("String");
        response.setDescription("参数描述");

        responseParameterMapper.save(response);

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
