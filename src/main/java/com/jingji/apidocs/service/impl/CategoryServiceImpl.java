/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jingji.apidocs.service.impl;

import com.jingji.apidocs.dao.CategoryMapper;
import com.jingji.apidocs.domain.Category;
import com.jingji.apidocs.service.CategoryService;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrator
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    
    @Resource
    private CategoryMapper categoryMapper;
    
    @Override
    public void save(Category category) {
        categoryMapper.save(category);
    }
}
