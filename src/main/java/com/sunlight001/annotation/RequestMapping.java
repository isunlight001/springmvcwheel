package com.sunlight001.annotation;


import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 定义请求路径的java annotation
 * 作用在类上和方法上,使用数组
 * @author sunlight001
 */
@Target({ElementType.TYPE,ElementType.METHOD}) 
@Retention(RetentionPolicy.RUNTIME)  
@Documented
public @interface RequestMapping {

    public String value() default "";
    
}
