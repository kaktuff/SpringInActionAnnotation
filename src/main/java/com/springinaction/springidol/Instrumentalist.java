package com.springinaction.springidol;


import com.springinaction.springidol.qualifiers.StringedInstrument;
import org.springframework.beans.factory.annotation.Autowired;

public class Instrumentalist implements Performer{
    private String song;

    // если использовать аннотацию у поля, то от метода set вообще можно отказаться(я его закомментировала)
    // @Autowired == byType
    // (required=false) - то есть параметр необязательный. и если нет объекта, соответсвующего типа, то ошибки не будет, а значение == null
    //@Autowired(required=false)
    @Autowired
    // это аннотирование с помощью аннтоции класса Guitar аннотацией @Qualifier("stringed")
    //@Qualifier("stringed") // это стандартный механизм, когда так аннотируем и класс, который нужно выбрать, и параметр класса, т.е. такая же аннотация дб у класса Guitar
    @StringedInstrument
    private Instrument instrument;

    public Instrument getInstrument() {
        return instrument;
    }

    private int age;

    public void setSong(String song) {
        this.song = song;
    }

    public String getSong() {
        return song;
    }

    public void setAge(int age) {
        this.age = age;
    }


//    @Autowired
//    public void setInstrument(Instrument instrument) {
//        this.instrument = instrument;
//    }

    public Instrumentalist() {
    }

    public void perform() throws Exception {
        System.out.print("Playing... " + song + ": ");
        instrument.play();
        System.out.println("instrument - " + instrument.toString());
    }
}