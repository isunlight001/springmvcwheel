package com.sunlight001.test;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sunlight001.annotation.Autowired;
import com.sunlight001.annotation.Controller;
import com.sunlight001.annotation.RequestMapping;
import com.sunlight001.annotation.RequestParam;

@Controller
@RequestMapping("test1")
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("test")
    public void myTest(HttpServletRequest request, HttpServletResponse response,
                      @RequestParam("param") String param){
        try {
        	testService.printParam(param);
            response.getWriter().write( "Test1Controller:the param you send is :"+param);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
