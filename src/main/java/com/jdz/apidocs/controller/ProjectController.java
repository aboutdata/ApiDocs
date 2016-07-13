package com.jdz.apidocs.controller;

import com.jdz.apidocs.domain.Category;
import com.jdz.apidocs.domain.Project;
import com.jdz.apidocs.service.CategoryService;
import com.jdz.apidocs.service.ProjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wangkun23 on 2016/7/13.
 */
@Controller
@RequestMapping(value = "/project")
public class ProjectController {
    private static final Logger logger = LoggerFactory.getLogger(ProjectController.class);

    @Resource
    private ProjectService projectService;

    @Resource
    private CategoryService categoryService;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String search(String keyword, Model model) {
        List<Project> list = projectService.search(keyword);
        model.addAttribute("list", list);
        return "/project/list";
    }

    @RequestMapping(value = "/details/{id}", method = RequestMethod.GET)
    public String details(@PathVariable("id") Long id, Model model) {
        if (id != null) {
            List<Category> list = categoryService.findByProjectId(id);
            model.addAttribute("list", list);
        } else {
            logger.info("id null");
        }
        return "/project/details";
    }

}
