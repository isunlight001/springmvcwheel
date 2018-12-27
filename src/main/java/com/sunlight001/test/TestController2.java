package com.sunlight001.test;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sunlight001.annotation.Autowired;
import com.sunlight001.annotation.Controller;
import com.sunlight001.annotation.RequestMapping;
import com.sunlight001.annotation.RequestParam;

@Controller
@RequestMapping("test2")
public class TestController2 {
    @Autowired
    private TestService testService;

    @RequestMapping("test")
    public void myTest(HttpServletRequest request, HttpServletResponse response,
                      @RequestParam("param") String param){
        try {
            response.getWriter().write( "Test2Controller:the param you send is :"+param);
            testService.printParam(param);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
