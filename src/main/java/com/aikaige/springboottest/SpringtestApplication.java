package com.aikaige.springboottest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringtestApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringtestApplication.class);
//        User user = (User)applicationContext.getBean("name");
    }
}
