package com.xuecheng.manage_course.exception;

import com.xuecheng.framework.exception.ExceptionCatch;
import com.xuecheng.framework.model.response.CommonCode;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ControllerAdvice;

/**
 * Created by home-pc on 2019/10/7.
 */
@ControllerAdvice //控制器增强
public class CustomExceptionCatch extends ExceptionCatch{

        static {
            builder.put( AccessDeniedException.class, CommonCode.UNAUTHORISE);
        }

}
