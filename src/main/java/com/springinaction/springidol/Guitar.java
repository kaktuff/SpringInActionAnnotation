package com.springinaction.springidol;

import com.springinaction.springidol.qualifiers.StringedInstrument;

// @Qualifier("stringed") // это стандартный механизм, когда так аннотируем и класс, который нужно выбрать, и параметр класса
@StringedInstrument
public class Guitar implements Instrument{
    public Guitar() {
    }

    public void play() {
        System.out.println("Guitar is playing Tryam");
    }
}
