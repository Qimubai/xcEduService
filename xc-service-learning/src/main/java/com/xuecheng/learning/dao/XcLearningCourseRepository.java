package com.xuecheng.learning.dao;

import com.xuecheng.framework.domain.learning.XcLearningCourse;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by home-pc on 2019/10/8.
 */
public interface XcLearningCourseRepository extends JpaRepository<XcLearningCourse,String> {

    //根据用户id和课程id查询
    XcLearningCourse findByUserIdAndCourseId(String userid,String courseId);
}
