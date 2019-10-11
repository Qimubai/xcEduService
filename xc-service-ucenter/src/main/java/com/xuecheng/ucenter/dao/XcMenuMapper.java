package com.xuecheng.ucenter.dao;

import com.xuecheng.framework.domain.ucenter.XcMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by home-pc on 2019/10/7.
 */
@Mapper
public interface XcMenuMapper {

    public List<XcMenu> selectPermissionByUserId(String userid);
}
