package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
    public static void main(String[] args) throws Exception{
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");

        // System.out.println("New xml-file");
        Performer kenny = (Performer)ctx.getBean("kenny");
        kenny.perform();
/*
        Performer eddie = (Performer)ctx.getBean("eddie");
        eddie.perform();*/

        // этот компонент был создан автоматически, т.к. в конфигурационном файлу обяъвлено:
        // <context:include-filter type="assignable" expression="com.springinaction.springidol.Instrument"/>
        Instrument guitar = (Instrument)ctx.getBean("guitar");
        guitar.play();



//        Performer performer = (Performer)ctx.getBean("duke");
//        performer.perform();
//
//        Performer performerUsingConstructor = (Performer)ctx.getBean("dukeUsingConstructor");
//        performerUsingConstructor.perform();
//
//        PoeticJuggler performerPoeticDuke = (PoeticJuggler)ctx.getBean("poeticDuke");
//        System.out.println("performerPoeticDuke.getBeanBags " + performerPoeticDuke.getBeanBags());
//        performerPoeticDuke.perform();
//
//        Performer kenny = (Performer)ctx.getBean("kenny");
//        kenny.perform();

        //InstrumentalistWithoutComponent kennyInstrumentalist = (InstrumentalistWithoutComponent)kenny;
        //System.out.println("getInstrument - " + kennyInstrumentalist.getInstrument());

//        Performer kennyPspace = (Performer)ctx.getBean("kennyPspace");
//        kennyPspace.perform();

//        Performer hankVone = (Performer)ctx.getBean("hankVone");
//        hankVone.perform();

//        Performer hankVTwo = (Performer)ctx.getBean("hankVTwo");
//        hankVTwo.perform();

//        Performer hankVThree = (Performer)ctx.getBean("hankVThree");
//        hankVThree.perform();

//        Performer karl = (Performer)ctx.getBean("karl");
//        karl.perform();

//        Performer karlSelectSong = (Performer)ctx.getBean("karlSelectSong");
//        karlSelectSong.perform();

//        Performer karlPI = (Performer)ctx.getBean("karlPI");
//        karlPI.perform();

//        Performer karlRandom = (Performer)ctx.getBean("karlRandom");
//        karlRandom.perform();

//        ClassBooleanParameter classBooleanParameter=(ClassBooleanParameter)ctx.getBean("classBooleanParameter");
//        System.out.println("classBooleanParameter - " + classBooleanParameter.isBool());

//        Person personOne = (Person)ctx.getBean("personOne");
//        System.out.println("personOne.city: " + personOne.getCity());
//
//        Person personTwo = (Person)ctx.getBean("personTwo");
//        System.out.println("personTwo.city: " + personTwo.getCity());

//        ClassStringParameter classStringParameter = (ClassStringParameter)ctx.getBean("classStringParameter");
//        System.out.println("classStringParameter.getStringParam() - " + classStringParameter.getStringParam());
//
//        ClassStringParameter homePath = (ClassStringParameter)ctx.getBean("homePath");
//        System.out.println("homePath.getStringParam() - " + homePath.getStringParam());

//        Person personLastElCollect = (Person)ctx.getBean("personLastElCollect");
//        System.out.println("personLastElCollect.city: " + personLastElCollect.getCity());
//
//        Person personFirsttElCollect = (Person)ctx.getBean("personFirsttElCollect");
//        System.out.println("personFirsttElCollect.city: " + personFirsttElCollect.getCity());

//        Governor governor = (Governor)ctx.getBean("governor");
//        // выведем все имена
//        for(String name:governor.getCityNames()){
//            System.out.println(name);
//        }

//        Governor governorNameState = (Governor)ctx.getBean("governorNameState");
//        // выведем все имена
//        for(String name:governorNameState.getCityNames()){
//            System.out.println(name);
//        }





//        Performer kenny = (Performer)ctx.getBean("eddie");
//        kenny.perform();

//        @Component
//        guitar.play();
    }
}

