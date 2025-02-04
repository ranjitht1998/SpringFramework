package com.spring1;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Laptop called");
    }

    @Override
    public void code(){
        System.out.println("Started coding using laptop");
    }
}
