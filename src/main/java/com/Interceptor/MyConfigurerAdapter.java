package com.Interceptor;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author ljp
 */
@Configuration
public class MyConfigurerAdapter implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).excludePathPatterns("/user/login").excludePathPatterns("/verify/*").excludePathPatterns("/user/checklogin").excludePathPatterns("/*.html").excludePathPatterns("/css/**").excludePathPatterns("/js/**").excludePathPatterns("/images/**").excludePathPatterns("/test/**");
    }


}
