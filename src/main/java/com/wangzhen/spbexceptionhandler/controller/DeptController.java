package com.wangzhen.spbexceptionhandler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName DeptController
 * @Description
 * @Author wangzhen
 * @Date 2018/12/9 下午12:38
 **/
@Controller
public class DeptController {

    @RequestMapping("/add")
    public String add(String deptname) throws Exception{
        System.out.println("add()......");
        if(deptname == null ){
            throw new NullPointerException("部门名称不能为空!");
        }
        return "success";
    }

}
