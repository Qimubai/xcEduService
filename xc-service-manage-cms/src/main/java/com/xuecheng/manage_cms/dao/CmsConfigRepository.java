package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsConfig;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by home-pc on 2019/9/4.
 */

public interface CmsConfigRepository extends MongoRepository<CmsConfig,String> {

}
