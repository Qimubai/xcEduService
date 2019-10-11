package com.xuecheng.api.MediaFile;

import com.xuecheng.framework.domain.media.MediaFile;
import com.xuecheng.framework.domain.media.request.QueryMediaFileRequest;
import com.xuecheng.framework.model.response.QueryResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Created by home-pc on 2019/9/24.
 */
@Api(value = "媒体文件管理",description = "媒体文件管理接口",tags = {"媒体文件管理接口"})
public interface MediaFileControllerApi {

    @ApiOperation("我的媒资查询文件列表")
    public QueryResponseResult<MediaFile> findList(int page, int size, QueryMediaFileRequest
            queryMediaFileRequest) ;

}
