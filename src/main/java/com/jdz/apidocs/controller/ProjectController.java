package com.jdz.apidocs.controller;

import com.jdz.apidocs.domain.Project;
import com.jdz.apidocs.service.ProjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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


    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String search(String keyword, Model model) {
        List<Project> list = projectService.search(keyword);
        model.addAttribute("list", list);
        return "/project/list";
    }

}
