/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.apidocs.test.service;

import com.jd.apidocs.domain.ApiDoc;
import com.jd.apidocs.domain.Category;
import com.jd.apidocs.domain.RequestParameter;
import com.jd.apidocs.domain.ResponseParameter;
import com.jd.apidocs.rest.response.ApiDocModel;
import com.jd.apidocs.service.ApiDocService;
import com.jd.apidocs.service.CategoryService;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Administrator
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class ApiDocServiceTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(ApiDocServiceTest.class);

    @Resource
    private ApiDocService apiDocService;

    @Test
    public void enpty() {
        LOGGER.debug("{} was tested", ApiDocServiceTest.class.getSimpleName());
    }

    //@Test
    public void findAll() {
        ApiDocModel result = apiDocService.findById(4);
        LOGGER.info("result {}", result);

    }

    //@Test
    public void findByCategoryId() {
        List<ApiDocModel> list = apiDocService.findByCategoryId(2);
        LOGGER.info("result {}", list.size());

    }

   // @Test
    public void save() {
        //保存这个apiddoc

        ApiDocModel apiDoc = new ApiDocModel();
//        ApiDoc apiDoc = new ApiDoc();
        apiDoc.setCategoryId(1);
        apiDoc.setName("接口名称");
        apiDoc.setDescription("描述");

        //保存参数信息
        RequestParameter request = new RequestParameter();
        request.setName("用户名");
        request.setType("String");
        request.setDescription("参数描述");

        ResponseParameter response = new ResponseParameter();

        response.setName("用户名");
        response.setType("String");
        response.setDescription("参数描述");

        List<RequestParameter> requests = new ArrayList<RequestParameter>();
        requests.add(request);
        apiDoc.setRequestParameters(requests);

        List<ResponseParameter> responses = new ArrayList<ResponseParameter>();
        responses.add(response);
        apiDoc.setResponseParameters(responses);

        apiDocService.addApiDoc(apiDoc);
    }
}
