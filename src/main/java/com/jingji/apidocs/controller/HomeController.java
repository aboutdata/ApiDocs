/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jingji.apidocs.controller;

import com.jingji.apidocs.dao.SequenceMapper;
import com.jingji.apidocs.domain.Sequence;
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
    private SequenceMapper sequenceMapper;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home1(Model model) {
        Sequence sq = sequenceMapper.getSequenceByName("ordernum");
        logger.info("#####Sequence {}",sq);
        
        return "index";
    }
}
