package com.wangzhen.spbexceptionhandler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName UserController
 * @Description
 * @Author wangzhen
 * @Date 2018/12/9 下午12:39
 **/
@Controller
public class UserController extends BaseController{

    @RequestMapping("/login")
    public String login(String username) throws Exception{
        System.out.println("login()......");
        if(username == null ){
            throw new NullPointerException("用户名不存在!");
        }
        return "success";
    }



}
