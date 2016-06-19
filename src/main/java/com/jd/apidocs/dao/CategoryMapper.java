package com.jd.apidocs.dao;

import com.jd.apidocs.domain.Category;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface CategoryMapper {

    public void save(Category ctegory);

    public List<Category> findAll();
}
