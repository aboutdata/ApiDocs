package com.jdz.apidocs.dao;

import com.jdz.apidocs.domain.Category;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface CategoryMapper {

    public void save(Category ctegory);

    public List<Category> findAll();
}
