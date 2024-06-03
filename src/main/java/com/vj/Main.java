package com.vj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //Java Based Config
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        Desktop desktop = context.getBean(Desktop.class);//By Type
        Desktop desktop1 = context.getBean("desktop", Desktop.class);
        //Default name is method name in AppConfig
        // To Change Use name attribute in @Bean
        desktop1.startUp();

        Desktop desktop2 = context.getBean("desktop", Desktop.class);
        desktop2.startUp();

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Employee employee = context.getBean("emp",Employee.class);
//        employee.startUp();
//        Employee employee2 = (Employee) context.getBean("emp2");
//        employee2.startUp();
//        System.out.println("=========================================");
//        Computer computer=context.getBean(Computer.class);//Get by bean type
//        computer.startUp();
//        Laptop laptop1 = (Laptop) context.getBean("laptop");
//        System.out.println(laptop1.getBrand());

//        laptop1.getSsd().runSsd();
//        laptop1.startUp();
    }
}