package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by home-pc on 2019/9/4.
 */
public interface CmsTemplateRepository extends MongoRepository<CmsTemplate,String> {

}
