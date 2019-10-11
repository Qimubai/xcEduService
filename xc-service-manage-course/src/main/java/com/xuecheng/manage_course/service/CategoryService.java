package com.xuecheng.manage_course.service;

import com.xuecheng.framework.domain.course.ext.CategoryNode;
import com.xuecheng.manage_course.dao.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by home-pc on 2019/9/10.
 */
@Service
public class CategoryService {

    @Autowired
    CategoryMapper categoryMapper;

    public CategoryNode list(){

        return categoryMapper.queryList();
    }



}
