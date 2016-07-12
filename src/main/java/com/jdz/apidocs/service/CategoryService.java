package com.jdz.apidocs.service;

import com.jdz.apidocs.domain.Category;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface CategoryService {

    public void save(Category category);

    public List<Category> findAll();

    public int getDefaultCategoryId();
   
   
}
