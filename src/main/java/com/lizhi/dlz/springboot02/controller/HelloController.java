package com.lizhi.dlz.springboot02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

/**
 * @author WANGLAICAI
 * @create 2018-09-25 20:28
 */
@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello world!";
    }

    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("tag","<h1>你好</h1>");
        map.put("message","helloworld");
        map.put("lists",Arrays.asList("sunwukong","zubajie","saheshang"));
        return "success";
    }

}
