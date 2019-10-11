package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsSite;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by home-pc on 2019/9/20.
 */
public interface CmsSiteRepository extends MongoRepository<CmsSite,String> {
}
