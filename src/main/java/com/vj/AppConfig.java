package com.vj;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
//    @Bean(name = {"des1","des2"})
    @Bean
    @Scope("prototype")//Default value is singleton
    public Desktop desktop() {
        return new Desktop();
    }
}
