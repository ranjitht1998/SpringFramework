package com.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj = context.getBean("alien" , Alien.class);
//        obj.setAge();
//        System.out.println(obj.getAge());
        obj.compile();
//        System.out.println(obj.getAge());

//        Alien obj1 = (Alien) context.getBean("alien");
//        System.out.println(obj1.getAge());
    }
}
