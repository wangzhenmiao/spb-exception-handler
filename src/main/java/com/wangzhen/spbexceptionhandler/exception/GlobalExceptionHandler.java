package com.wangzhen.spbexceptionhandler.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName GlobalExceptionHandler
 * @Description
 * @Author wangzhen
 * @Date 2018/12/9 下午12:40
 **/
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Object globalErrorHandler(HttpServletRequest request, Exception e) throws Exception {
        System.out.println("GlobalExceptionHandler globalErrorHandler()......");
        // 创建返回对象Map并设置属性，会被@ResponseBody注解转换为JSON返回
        Map<String, Object> map = new HashMap<>();
        map.put("code", 100);
        map.put("message", e.getMessage());
        map.put("url", request.getRequestURL().toString());
        map.put("data", "请求失败");
        return map;
    }

}
