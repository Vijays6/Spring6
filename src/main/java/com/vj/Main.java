package com.vj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Employee employee = (Employee) context.getBean("emp");
        employee.startUp();
        Employee employee2 = (Employee) context.getBean("emp2");
        employee2.startUp();
//        Laptop laptop1 = (Laptop) context.getBean("laptop");
//        System.out.println(laptop1.getBrand());

//        laptop1.getSsd().runSsd();
//        laptop1.startUp();
    }
}