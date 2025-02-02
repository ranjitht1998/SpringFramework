package com.spring1;

public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Laptop called");
    }

    @Override
    public void code(){
        System.out.println("Started coding using laptop");
    }
}
