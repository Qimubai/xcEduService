package com.xuecheng.api.MediaFile;

import com.xuecheng.framework.domain.media.response.CheckChunkResult;
import com.xuecheng.framework.model.response.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by home-pc on 2019/9/23.
 */
@Api(value = "/媒资管理",description = "媒资管理的接口，提供文件上传接口")
public interface MediaUploadControllerApi {
    //文件上传前的准备工作

    @ApiOperation( "文件上传注册" )
    public ResponseResult register(String fileMd5,
                                    String fileName,
                                    Long fileSize,
                                    String mimeType,
                                    String fileExt
                                    );
    @ApiOperation( "检验分块是否存在" )
    public CheckChunkResult checkchunk(
            String fileMd5,
            Integer chunk,
            Integer chunkSize
    );

    @ApiOperation("上传分块")
    public ResponseResult uploadchunk(
            MultipartFile file,
            String fileMd5,
            Integer chunk

    );

    @ApiOperation( "合并分块" )
    public ResponseResult mergechunks(String fileMd5,
                                       String fileName,
                                       Long fileSize,
                                       String mimeType,
                                       String fileExt);



}
