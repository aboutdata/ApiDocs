package com.jdz.apidocs.dao;

import com.jdz.apidocs.domain.Project;

/**
 * Created by wangkun23 on 2016/7/13.
 */
public interface ProjectMapper {

    public void save(Project project);

    public Project findById(Long id);

}
