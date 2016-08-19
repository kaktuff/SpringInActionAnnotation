package com.springinaction.springidol;

import javax.inject.Provider;
import java.util.Set;

public class KnifeJuggler extends Juggler{
    private Set<Knife> knives;

    public KnifeJuggler(Provider<Knife> knifeProvider) {
        System.out.println("dsf");
    }
}
