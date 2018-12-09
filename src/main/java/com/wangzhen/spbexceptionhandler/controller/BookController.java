package com.wangzhen.spbexceptionhandler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName BookController
 * @Description
 * @Author wangzhen
 * @Date 2018/12/9 下午12:37
 **/
@Controller
public class BookController extends BaseController{

    @RequestMapping("/find")
    public String find() throws Exception{
        System.out.println("find()......");
        int i = 5/0;
        return "success";
    }

}
