package com.spring1.config;

import com.spring1.Alien;
import com.spring1.Computer;
import com.spring1.Desktop;
import com.spring1.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.spring1")
public class AppConfig {

//    @Bean
//    public Alien alien(Computer com){
//        Alien obj = new Alien();
//        obj.setAge(22);
//        obj.setCom(com);
//        return obj;
//    }
//
//////    @Bean(name = {"desk"})
////    @Bean
////    @Scope("prototype")
////    public Desktop desktop(){
////        return new Desktop();
////    }
////
//    @Bean
//    public Laptop laptop(){
//        return new Laptop();
//    }

}
