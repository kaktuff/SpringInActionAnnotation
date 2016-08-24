package com.springinaction.springidol;

// @Qualifier("stringed") // это стандартный механизм, когда так аннотируем и класс, который нужно выбрать, и параметр класса
// @StringedInstrument

// по умолчанию создастся объект с таким же именем как имя класса, только с мелком первой буквы
// @Component
// позже заменили аннотацию @Component для класса Guitar таким образом, чтобы создавались компоненты для всех классов, реализующих интерфейс Instrument

public class Guitar implements Instrument{
    public Guitar() {
    }

    public void play() {
        System.out.println("Guitar is playing Strum-strum-strum");
    }
}
