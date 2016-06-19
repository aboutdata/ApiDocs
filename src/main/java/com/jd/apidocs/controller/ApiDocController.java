package com.jd.apidocs.controller;

import com.jd.apidocs.rest.response.ApiDocModel;
import com.jd.apidocs.service.ApiDocService;
import com.jd.apidocs.service.CategoryService;

import java.util.List;
import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Administrator
 */
@Controller
@RequestMapping(value = "/docs")
public class ApiDocController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Resource
    private CategoryService categoryService;

    @Resource
    private ApiDocService apiDocService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(@RequestParam(value = "categoryId",required = false)Integer categoryId, Model model) {
        logger.info("categoryId {}",categoryId);
        if (categoryId == null) {
            categoryId = categoryService.getDefaultCategoryId();
        }

        List<ApiDocModel> list = apiDocService.findByCategoryId(categoryId);
        logger.info("list{}", list.size());
        model.addAttribute("list", list);
        return "/docs/list";
    }

    @RequestMapping(value = "/details/{id}", method = RequestMethod.GET)
    public String details(@PathVariable("id") int id, Model model) {
        ApiDocModel apiDoc = apiDocService.findById(id);
        model.addAttribute("apiDoc", apiDoc);
        return "/docs/details";
    }
}
