package com.jobs.demo1.config;

import org.apache.catalina.webresources.StandardRoot;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.apache.catalina.Context;

/**
 * @author Tim_Shu
 * @create 2022-04-02-16:38
 */
@Configuration
public class WebConfig {
    @Bean
    public TomcatServletWebServerFactory embeddedServletContainerFactory() {
        return new TomcatServletWebServerFactory() {

            @Override
            protected void postProcessContext(Context context) {
                final int maxCacheSize = 40 * 1024;
                StandardRoot standardRoot = new StandardRoot(context);
                standardRoot.setCacheMaxSize(maxCacheSize);
                context.setResources(standardRoot);
            }
        };
    }
}
