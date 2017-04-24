package com.testData;

import com.log.LogMethodExecutionTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Kaktuff on 24.04.2017.
 */
@Component
@LogMethodExecutionTime(logText = "текст класса1. Время выполнения:")
public class ClassOne {
    @Autowired
    ClassTwo classTwo;
    //@LogMethodExecutionTime(logText = "текст метода1. Время выполнения:")
    public void methodOne(){
        System.out.println("methodOne");
        classTwo.methodTwo();
    }
}
