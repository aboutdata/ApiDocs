/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdz.apidocs.controller;

import com.jdz.apidocs.service.ApiDocService;
import com.jdz.apidocs.service.CategoryService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

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
    public String home(HttpServletRequest request,Model model) {

        return "index";
    }
}
