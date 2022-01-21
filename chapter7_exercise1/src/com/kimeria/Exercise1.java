package com.kimeria;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Exercise1 {

    public static void main(String[] Args) {
        PersonJava john = new PersonJava(11L, "Mr", "John", "Blue", new GregorianCalendar(1977, Calendar.SEPTEMBER, 3));
        PersonJava jane = new PersonJava(21L, "Mrs", "Jane", "Green", null);
        System.out.println(john + "'s age is " + john.getAge());
        System.out.println(jane + "'s age is " + jane.getAge());
        System.out.println("The age of someone born on 3rd May 1988 is " + PersonJava.getAge(new GregorianCalendar(1988, Calendar.MAY, 3)));
    }
}
