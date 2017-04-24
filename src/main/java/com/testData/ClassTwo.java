package com.testData;

import com.log.LogMethodExecutionTime;
import org.springframework.stereotype.Component;

/**
 * Created by Kaktuff on 24.04.2017.
 */
@Component
public class ClassTwo {
    @LogMethodExecutionTime(logText = "текст метода2. Время выполнения:")
    public void methodTwo() {
        System.out.println("methodTwo");
    }
}
