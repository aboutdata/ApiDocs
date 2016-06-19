package com.jd.apidocs.test.service;


import com.jd.apidocs.domain.Category;
import com.jd.apidocs.service.CategoryService;
import java.util.List;
import javax.annotation.Resource;
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
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class CategoryServiceTest {
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
}
