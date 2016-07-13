package com.jdz.apidocs.test.dao;

import com.jdz.apidocs.dao.ProjectMapper;
import com.jdz.apidocs.domain.Project;
import com.jdz.apidocs.test.TestBase;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

/**
 * Created by wangkun23 on 2016/7/13.
 */
public class ProjectDaoTest extends TestBase {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProjectDaoTest.class);

    @Resource
    private ProjectMapper projectMapper;

    //@Test
    public void test() {
        Project project = new Project();

        project.setName("testName");
        project.setDescription("test描述");

        projectMapper.save(project);
        LOGGER.info("##########");
    }

    //@Test
    public void findById() {
        Project project = projectMapper.findById(6L);
        LOGGER.info("########## {}",project);
    }

}
