package com.jdz.apidocs.controller;

import com.jdz.apidocs.domain.Category;
import com.jdz.apidocs.service.ApiDocService;
import com.jdz.apidocs.service.CategoryService;

import java.util.List;
import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Administrator
 */
@Controller
@RequestMapping(value = "/category")
public class CategoryController {

    private static final Logger logger = LoggerFactory.getLogger(CategoryController.class);

    @Resource
    private CategoryService categoryService;

    @Resource
    private ApiDocService apiDocService;

    @RequestMapping(value = "/list/{projectId}", method = RequestMethod.GET)
    public String list(@PathVariable("projectId") Long projectId, Model model) {

        if (projectId != null) {
            List<Category> list = categoryService.findByProjectId(projectId);
            model.addAttribute("list", list);
            logger.info("list{}", list.size());
        } else {
            logger.info("projectId null");
        }
        return "/category/list";
    }
}
