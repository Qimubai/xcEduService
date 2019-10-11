package com.xuecheng.manage_course.dao;

import com.xuecheng.framework.domain.course.ext.TeachplanNode;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by home-pc on 2019/9/7.
 */
@Mapper
public interface TeachplanMapper {


    public TeachplanNode selectList(String courseId);
}
