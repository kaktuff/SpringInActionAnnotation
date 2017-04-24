package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import com.testData.ClassOne;

/**
 * Created by Kaktuff on 24.04.2017.
 */
@Service
public class TestClass {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol-withoutAnnotation.xml");
        System.out.println("внутри main");
        ClassOne classOne = (ClassOne)ctx.getBean("classOne");
        classOne.methodOne();
    }
}
