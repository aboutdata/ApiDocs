package com.jingji.apidocs.dao;

import com.jingji.apidocs.domain.Category;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface CategoryMapper {

    public void save(Category ctegory);

    public List<Category> findAll();
}
