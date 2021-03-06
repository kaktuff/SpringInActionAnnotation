package com.springinaction.springidol;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Аннотация @Configuration подсказывает фреймворку Spring, что
// данный класс содержит одно или более определений компонентов
@Configuration
public class SpringIdolConfig {

    @Bean
    public Performer duke(){
        return new Juggler();
    }

    @Bean
    public Performer duke15(){
        return new Juggler(15);
    }

    @Bean
    public Guitar guitar(){return new Guitar();}

    @Bean
    public Performer kenny(){
        Instrumentalist kenny = new Instrumentalist();
        kenny.setSong("Kenny Song bla-bla-bla-bla-bla");
        // компонент guitar был создан автоматически, т.к. в конфигурационном файлу обяъвлено:
        // <context:include-filter type="assignable" expression="com.springinaction.springidol.Instrument"/>
        kenny.setInstrument(guitar());
        return kenny;
    }

    @Bean
    public Poem sonnet29() {
        return new Sonnet29();
    }

    @Bean
    public Performer poeticDuke() {
        return new PoeticJuggler(sonnet29());
    }
}
