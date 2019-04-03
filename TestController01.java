package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller//表示当前类是controller
@RequestMapping("/test")
public class TestController01 {
    @RequestMapping(value = "/requestPost.do" ,method = RequestMethod.POST)//RequestMethod枚举类
        //通过method来限定浏览器请求的方式
    public ModelAndView reqpost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv=new ModelAndView();
        mv.addObject("method","只支持post");
        mv.setViewName("post");
        return mv;
    }
    @RequestMapping(value = "/requestGet.do" ,method = RequestMethod.GET)
    /*params,通过这个属性可以指定请求中必须携带的参数
        params={"!name",""age}
         params={"name",""age}
     */

    public ModelAndView reqget(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        ModelAndView mv=new ModelAndView();
        mv.addObject("method","只支持get");
        mv.setViewName("get");
        return mv;
    }
}
