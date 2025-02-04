package com.spring1;

import com.spring1.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        //Java Based Configuration
        ApplicationContext cx= new AnnotationConfigApplicationContext(AppConfig.class);
        Alien obj1 = cx.getBean(Alien.class);
        System.out.println(obj1.getAge());
        obj1.compile();
//        Desktop dt = cx.getBean("desktop",Desktop.class);
//        dt.code();
//
//        Alien al = cx.getBean(Alien.class);
//        System.out.println(al.getAge());
//        al.compile();

        //XML Based Configuration

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Alien obj = context.getBean("alien" , Alien.class);
//        obj.setAge();
//        System.out.println(obj.getAge());
//        obj.compile();
//        System.out.println(obj.getAge());

//        Alien obj1 = (Alien) context.getBean("alien");
//        System.out.println(obj1.getAge());
    }
}
