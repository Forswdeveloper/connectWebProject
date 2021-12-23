package com.conn.pro.cmm;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ConnnetConfig implements WebMvcConfigurer {
	@Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new ConnectProjectIntercepter())
                .addPathPatterns("/*")
                .excludePathPatterns("/board"); // 해당 경로는 인터셉터가 가로채지 않는다.
    }
}
