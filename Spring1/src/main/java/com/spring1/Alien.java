package com.spring1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Value("22")
    private int age;
    @Autowired
    @Qualifier("laptop")
    Computer com;

    public Alien(int age,Computer com) {
        System.out.println("Alien args constructor called");
        this.age = age;
        this.com = com;
    }

    public Alien(){
        System.out.println("Alien called");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void compile(){
        System.out.println("Started compiling");
        com.code();
    }
}
