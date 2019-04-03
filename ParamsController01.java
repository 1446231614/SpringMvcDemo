package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class ParamsController01 {
    @RequestMapping("/params01")
    public ModelAndView getparams01(String username,int age) throws Exception{
        //方法的参数名需要同前台表单里边的input一致
       ModelAndView mv=new ModelAndView();
       mv.addObject("username",username);
       mv.addObject("age",age);
       mv.setViewName("result");
       return mv;
    }
}
