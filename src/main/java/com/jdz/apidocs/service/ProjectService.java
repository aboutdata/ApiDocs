package com.jdz.apidocs.service;

import com.jdz.apidocs.domain.Project;

import java.util.List;

/**
 * Created by wangkun23 on 2016/7/13.
 */
public interface ProjectService {

    public void save(Project project);

    public Project findById(Long id);

    public List<Project> search(String keyword);

}
