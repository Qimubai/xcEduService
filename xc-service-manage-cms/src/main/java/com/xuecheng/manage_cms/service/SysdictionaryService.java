package com.xuecheng.manage_cms.service;

import com.xuecheng.framework.domain.system.SysDictionary;
import com.xuecheng.manage_cms.dao.SysDictionaryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by home-pc on 2019/9/10.
 */
@Service
public class SysdictionaryService {

    @Autowired
    SysDictionaryDao sysDictionaryDao;


    public SysDictionary findDictionaryByType(String type){

        return  sysDictionaryDao.findBydType(type);
    }
}
