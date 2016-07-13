/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdz.apidocs.service.impl;

import com.jdz.apidocs.dao.CategoryMapper;
import com.jdz.apidocs.domain.Category;
import com.jdz.apidocs.service.CategoryService;

import java.util.List;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

/**
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

    @Override

    public List<Category> findAll() {
        return categoryMapper.findAll();
    }

    @Override
    public int getDefaultCategoryId() {
        return 1;
    }

    @Override
    public List<Category> findByProjectId(Long projectId) {
        return categoryMapper.findByProjectId(projectId);
    }
}
