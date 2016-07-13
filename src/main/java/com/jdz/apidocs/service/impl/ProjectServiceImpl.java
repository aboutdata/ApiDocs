package com.jdz.apidocs.service.impl;

import com.jdz.apidocs.dao.ProjectMapper;
import com.jdz.apidocs.domain.Project;
import com.jdz.apidocs.service.ProjectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wangkun23 on 2016/7/13.
 */
@Service
public class ProjectServiceImpl implements ProjectService {

    @Resource
    private ProjectMapper projectMapper;

    @Override
    public void save(Project project) {
        projectMapper.save(project);
    }

    @Override
    public Project findById(Long id) {
        return projectMapper.findById(id);
    }

    @Override
    public List<Project> search(String keyword) {
        return projectMapper.findByLikeName(keyword);
    }
}
