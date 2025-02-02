package com.spring1;

public class Desktop implements Computer{

    public Desktop() {
        System.out.println("Desktop called");
    }

    @Override
    public void code() {
        System.out.println("Coding using Desktop");
    }
}
