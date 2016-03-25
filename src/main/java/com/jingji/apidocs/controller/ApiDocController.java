package com.jingji.apidocs.controller;

import com.jingji.apidocs.rest.response.ApiDocModel;
import com.jingji.apidocs.service.ApiDocService;
import com.jingji.apidocs.service.CategoryService;
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
 *
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
    public String list(int categoryId, Model model) {
        List<ApiDocModel> list = apiDocService.findByCategoryId(categoryId);
        logger.info("list{}", list.size());
        return "list";
    }

    @RequestMapping(value = "/details/{id}", method = RequestMethod.GET)
    public String details(@PathVariable("id") int id, Model model) {
        ApiDocModel apiDoc = apiDocService.findById(id);
        model.addAttribute("apiDoc", apiDoc);
        return "/docs/details";
    }
}
