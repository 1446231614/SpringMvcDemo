package com.spring.mvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Controller//表示当前类是controller
public class HelloSpringMVC {
    //@Override代表重写父类中的方法
    //@RequestMapping("hello.do")
        @RequestMapping({"/test/hello.do","/test/world.do"})//表明是一个命名空间
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv=new ModelAndView();
        mv.addObject("hello","hello first spring mvc");
        mv.setViewName("first");
        return mv;
            /**通配符：在Requestmapping中可以使用*表示通配符
             *@RequestMapping("/hello*.do")
               @RequestMapping("/*hello.do")
             */
    }
    @RequestMapping("/test/hello.do")//表明是一个命名空间
    public ModelAndView text1(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv=new ModelAndView();
        mv.addObject("hello","hello first spring mvc");
        mv.setViewName("first");
        return mv;
    }
}
