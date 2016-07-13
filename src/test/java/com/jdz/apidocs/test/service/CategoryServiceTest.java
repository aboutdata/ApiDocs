package com.jdz.apidocs.test.service;


import com.jdz.apidocs.domain.Category;
import com.jdz.apidocs.service.CategoryService;
import java.util.List;
import javax.annotation.Resource;

import com.jdz.apidocs.test.TestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author Administrator
 */
public class CategoryServiceTest extends TestBase {
 private static final Logger LOGGER = LoggerFactory.getLogger(CategoryServiceTest.class);

    @Resource
    private CategoryService categoryService;
    
    @Test
    public void enpty() {
         LOGGER.debug("{} was tested", CategoryServiceTest.class.getSimpleName());
    }
   
    //@Test
    public void findAll() {
        List<Category> list = categoryService.findAll();
        LOGGER.info("list {}",list.size());
     
    }

    @Test
    public void findByProjectId() {
        List<Category> list = categoryService.findByProjectId(6L);
        LOGGER.info("list {}",list.size());

    }
}
