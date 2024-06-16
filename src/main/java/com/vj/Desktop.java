package com.vj;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{
    public Desktop(){
        System.out.println("Desktop Constructor Called...");
    }
    @Override
    public void startUp() {
        System.out.println("Desktop Startup");
    }
}
