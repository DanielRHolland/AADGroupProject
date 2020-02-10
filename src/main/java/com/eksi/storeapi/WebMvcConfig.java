package com.eksi.storeapi;


import com.eksi.storeapi.Interceptors.AuthenticationInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AuthenticationInterceptor()).addPathPatterns("/staff/*").addPathPatterns("/*");//add paths to protect here
    }
}
