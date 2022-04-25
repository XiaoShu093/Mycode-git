package com.jobs.demo1.config;

import com.jobs.demo1.interceptor.UserInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Tim_Shu
 * @create 2022-04-16-16:10
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        String[] addPaths = {"/**"};
        String[] excludePaths = {"/","/regist","/login","/errorPage","/registPage"};

        registry.addInterceptor(new UserInterceptor()).addPathPatterns(addPaths).excludePathPatterns(excludePaths);
    }
}
