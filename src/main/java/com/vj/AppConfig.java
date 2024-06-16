package com.vj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan("com.vj")
public class AppConfig {
//    @Bean(name = {"des1","des2"})
//    @Bean
//    //@Scope("prototype")//Default value is singleton
//    public Desktop desktop() {
//        return new Desktop();
//    }
//    @Bean
//    @Primary
//    //@Scope("prototype")//Default value is singleton
//    public Laptop laptop(@Qualifier("ssd") Ssd ssd) {//If we want to mention bean name use Qualifier
//        Laptop laptop=new Laptop();
//        laptop.setSsd(ssd);
//        return laptop;
//    }
//    @Bean
//    public Ssd ssd(){
//        return new Ssd();
//    }
//    @Bean
//    public Employee employee(@Autowired Computer computer){//it will fetch desktop obj --> @Autowired is optional to write
//        Employee employee=new Employee();
//        employee.setId(1);
//        employee.setCom(computer);
//        return employee;
//    }
}
