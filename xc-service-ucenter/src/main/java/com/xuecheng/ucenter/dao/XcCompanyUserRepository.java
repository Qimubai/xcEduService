package com.xuecheng.ucenter.dao;

import com.xuecheng.framework.domain.ucenter.XcCompanyUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by home-pc on 2019/9/28.
 */
public interface XcCompanyUserRepository  extends JpaRepository<XcCompanyUser,String> {

    //根据用户id查询所属企业id
    XcCompanyUser findByUserId(String userId);
}
