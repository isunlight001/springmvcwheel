package com.sunlight001.web.UI;

import com.sunlight001.annotation.Controller;
import com.sunlight001.annotation.RequestMapping;
import com.sunlight001.web.view.View;

/**
 * 使用Controller注解标注LoginUI类
 */
@Controller
public class LoginUI {
    
    //使用RequestMapping注解指明forward1方法的访问路径  
    @RequestMapping("LoginUI/login2")
    public View forward1(){
        //执行完forward1方法之后返回的视图
        return new View("/login2.jsp");  
    }
    
    //使用RequestMapping注解指明forward2方法的访问路径  
    @RequestMapping("LoginUI/login3")
    public View forward2(){
        //执行完forward2方法之后返回的视图
        return new View("/login3.jsp");  
    } 
}
