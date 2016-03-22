/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jingji.apidocs.controller;

import com.jingji.apidocs.dao.SequenceMapper;
import com.jingji.apidocs.domain.Category;
import com.jingji.apidocs.domain.Sequence;
import com.jingji.apidocs.rest.response.ApiDocModel;
import com.jingji.apidocs.service.ApiDocService;
import com.jingji.apidocs.service.CategoryService;
import java.util.List;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Administrator
 */
@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Resource
    private CategoryService categoryService;

    @Resource
    private ApiDocService apiDocService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home1(Model model) {
        ///Sequence sq = sequenceMapper.getSequenceByName("ordernum");
//        Category category = new Category();
//        category.setName("测试api");
//        categoryService.save(category);
//      
        //apiDocService.addApiDoc(new ApiDocModel());
//        logger.info("#####Sequence {}", category);
        List<ApiDocModel> list = apiDocService.findByPage();
        logger.info("list{}",list.size());
        return "index";
    }
}
