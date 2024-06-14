package com.vj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
//    @Bean(name = {"des1","des2"})
    @Bean
    //@Scope("prototype")//Default value is singleton
    public Desktop desktop() {
        return new Desktop();
    }
    @Bean
    @Primary
    //@Scope("prototype")//Default value is singleton
    public Laptop laptop(Ssd ssd) {
        Laptop laptop=new Laptop();
        laptop.setSsd(ssd);
        return laptop;
    }
    @Bean
    public Ssd ssd(){
        return new Ssd();
    }
    @Bean
    public Employee employee(@Autowired Computer computer){//it will fetch desktop obj --> @Autowired is optional to write
        Employee employee=new Employee();
        employee.setId(1);
        employee.setCom(computer);
        return employee;
    }
}
