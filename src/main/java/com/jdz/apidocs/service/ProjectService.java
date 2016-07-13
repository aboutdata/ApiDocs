package com.jdz.apidocs.service;

import com.jdz.apidocs.domain.Project;

/**
 * Created by wangkun23 on 2016/7/13.
 */
public interface ProjectService {

    public void save(Project project);

    public Project findById(Long id);

}
