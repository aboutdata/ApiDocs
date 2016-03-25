/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jingji.apidocs.test.service;

import com.jingji.apidocs.domain.Category;
import com.jingji.apidocs.rest.response.ApiDocModel;
import com.jingji.apidocs.service.ApiDocService;
import com.jingji.apidocs.service.CategoryService;
import java.util.List;
import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
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
}
