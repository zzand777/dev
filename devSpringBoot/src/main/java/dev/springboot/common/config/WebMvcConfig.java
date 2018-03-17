package dev.springboot.common.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import dev.springboot.common.interceptor.CommonInterceptor;

@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport {

    @Autowired
	private CommonInterceptor commonInterceptor;

    @Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(commonInterceptor);
		//registry.addInterceptor(commonInterceptor) .addPathPatterns("/**") .excludePathPatterns("/public/**");
	}

}