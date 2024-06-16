package com.vj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Employee implements Computer {
    @Value("${emp.id}")
    private int id;

    @Autowired //Field Injection
    @Qualifier("laptop")
    Computer com;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Computer getCom() {
        return com;
    }

    //Constructor Injection is also there
    @Autowired //Setter Injection
    @Qualifier("desktop")
// if autowired and qualifier mentioned hereQualifier is priority over Primary annotation in bean
    public void setCom(Computer com) {
        this.com = com;
    }

    @Override
    public void startUp() {
        com.startUp();
    }
}
