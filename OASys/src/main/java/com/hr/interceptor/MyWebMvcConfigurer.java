package com.hr.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        String[] notLoginInterceptPaths = {"/login.html", "/usermanage/queryAoaUserByNameAndPwd",
                "/bootstrap/**","/css/**","/easyui/**","/images/**","/js/**","/plugins/**","/sysmanage/**","/taskmanage/**"};
        //addPathPatterns 用于添加拦截规则
        //excludePathPatterns 用于排除拦截
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**")
                .excludePathPatterns(notLoginInterceptPaths);
//                .excludePathPatterns("/hlladmin/login") //登录页
    }
}
