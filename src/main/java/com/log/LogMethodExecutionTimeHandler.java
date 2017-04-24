package com.log;

import com.google.common.base.Stopwatch;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * обработчик аннотации {@link LogMethodExecutionTime}
 */
@Aspect
@Component
public class LogMethodExecutionTimeHandler {
    //todo !!! для private методов не работает
    //todo так НЕ работает
    //@Pointcut("execution(@LogMethodExecutionTime * *.*(..))")
    //todo так работает нормально, но это вроде бы не то что нужно и хочется разобраться почему вариант выше не работает
    //@Pointcut("@annotation(com.sbt.mgr.system.com.log.LogMethodExecutionTime) && execution(* *.*(..))")
    //void annotatedMethod() {}

/*    @Pointcut("execution(* (@LogMethodExecutionTime *).*(..))")
    void methodOfAnnotatedClass() {}*/

/*    @Around(value = "annotatedMethod() && @annotation(methodLevel)")
    public Object adviseAnnotatedMethods(ProceedingJoinPoint pjp,
                                         LogMethodExecutionTime methodLevel) throws Throwable {
        return aroundImplementation(pjp, methodLevel);
    }*/

/*    @Around("annotatedMethod() && @annotation(methodLevel)")
    public Object adviseAnnotatedMethods(ProceedingJoinPoint pjp,
                                         LogMethodExecutionTime methodLevel) throws Throwable {
        return aroundImplementation(pjp, methodLevel);
    }*/

/*    //todo сделаем пока аннотацию только для методов, а потом добавим аннотации для классов, то есть для всех их внутренних методов
    @Around("methodOfAnnotatedClass() && !annotatedMethod() && @within(classLevel)")
    public Object adviseMethodsOfAnnotatedClass(ProceedingJoinPoint pjp,
                                                LogMethodExecutionTime classLevel) throws Throwable {
        return aroundImplementation(pjp, classLevel);
    }*/

//    @Pointcut(value = "@annotation(com.log.LogMethodExecutionTime)")
//    void annotatedMethod() {
//        //точка среза для обработчика аннотации
//    }
//
//    @Around(value = "annotatedMethod() && @annotation(methodLevel)")
//    public Object adviseAnnotatedMethods(ProceedingJoinPoint pjp,
//                                         LogMethodExecutionTime methodLevel) throws Throwable {
//        return aroundImplementation(pjp, methodLevel);
//    }

/*    @Pointcut(value = "@within(LogMethodExecutionTime)")
    void methodOfAnnotatedClass() {
        //точка среза для обработчика аннотации
    }*/


    //@Around(value = "!annotatedMethod() && methodOfAnnotatedClass() && @within(classLevel)")
/*    @Around(value = "methodOfAnnotatedClass() && @within(classLevel)")
    public Object adviseMethodsOfAnnotatedClass(ProceedingJoinPoint pjp,
                                                LogMethodExecutionTime classLevel) throws Throwable {
        return aroundImplementation(pjp, classLevel);
    }*/

/*
    @Around("methodOfAnnotatedClass()")
    public Object adviseMethodsOfAnnotatedClass(ProceedingJoinPoint pjp
                                                ) throws Throwable {
        return "sd";
    }
*/


    private Object aroundImplementation(ProceedingJoinPoint pjp, LogMethodExecutionTime annotation) throws Throwable {
        Stopwatch stopwatch = Stopwatch.createStarted();
        Object result = pjp.proceed();
        stopwatch.stop();
        String logText = annotation.logText() + stopwatch;
        System.out.println(logText);
        return result;
    }

//    @Around("@annotation(com.log.LogMethodExecutionTime) && execution(* *.*(..))")
//    public void handler(){
//        System.out.println("In handler");
//    }

    @Pointcut(value = "@annotation(com.log.LogMethodExecutionTime)")
    void annotatedMethod() {
        //точка среза для обработчика аннотации
    }

    @Around(value = "annotatedMethod() && @annotation(methodLevel)")
    public Object adviseAnnotatedMethods(ProceedingJoinPoint pjp,
                                         LogMethodExecutionTime methodLevel) throws Throwable {
        return aroundImplementation(pjp, methodLevel);
    }

/*    @Around(value = "@within(com.log.LogMethodExecutionTime) || @annotation(com.log.LogMethodExecutionTime)")
    public Object adviseMethodsOfAnnotatedClass(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("sd");
        Object result = pjp.proceed();
        return "sd";
    }*/

    @Pointcut(value = "@within(com.log.LogMethodExecutionTime)")
    void methodOfAnnotatedClass() {
        //точка среза для обработчика аннотации
    }

    @Around(value = "methodOfAnnotatedClass() && @within(classLevel) && !annotatedMethod()")
    public Object adviseMethodsOfAnnotatedClass(ProceedingJoinPoint pjp,
                                                LogMethodExecutionTime classLevel) throws Throwable {
        return aroundImplementation(pjp, classLevel);
    }
}