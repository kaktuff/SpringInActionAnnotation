package com.springinaction.springidol;

import javax.inject.Provider;
import java.util.Set;

public class KnifeJuggler extends Juggler{
    private Set<Knife> knives;

    // не стала до конца разбираться с Provider<Knife> (page 186)
    public KnifeJuggler(Provider<Knife> knifeProvider) {
        System.out.println("dsf");
    }
}
