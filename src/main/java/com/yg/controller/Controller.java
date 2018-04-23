package com.yg.controller;

import com.github.pagehelper.PageHelper;
import com.yg.bean.Demo;
import com.yg.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private DemoService demoService;


    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
    @RequestMapping("/hello1")
    public String hello1(){
        return "hello11";
    }



    @RequestMapping("/likeName")
    public List<Demo> likeName(String name){
        PageHelper.startPage(1,2);
        return demoService.likeName(name);
    }

    @RequestMapping("/save")
    public Demo save(){
        Demo demo = new Demo();
        demo.setName("于光");
        demoService.save(demo);
        return demo;
    }

    @RequestMapping("/save2")
    public Demo save2(){
        Demo demo = new Demo();
        demo.setName("于光2");
        demoService.save2(demo.getName());
        return demo;
    }



}
