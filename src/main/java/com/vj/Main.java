package com.vj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Laptop laptop1= (Laptop) context.getBean("laptop");
        Laptop laptop2= (Laptop) context.getBean("laptop");

    }
}