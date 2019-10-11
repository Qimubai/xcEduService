package com.xuecheng.ucenter.dao;

import com.xuecheng.framework.domain.ucenter.XcUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by home-pc on 2019/9/28.
 */

public interface XcUserRepository extends JpaRepository<XcUser, String>
{
    XcUser findXcUserByUsername(String username);
}
