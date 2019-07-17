package com.tar.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        //this class from depandancy it looks to xml file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(

                "applicationContext.xml");
        //bean id="testBean" and class obj we want to receive
        TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());
        //close app after the finish
        context.close();
    }
}
