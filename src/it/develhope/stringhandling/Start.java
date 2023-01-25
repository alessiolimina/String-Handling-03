package it.develhope.stringhandling;

import java.lang.reflect.Array;

public class Start {

    public static void main(String[] args) {

        System.out.println("----------Starting------------------");

        String[] array1 = {" I want ", " to learn ", " how to code! "};

        String[] array2 = {" I want ".trim(), " to learn ".trim(), " how to code! ".trim()};

        int statement1 = (array2[0].compareTo("I want"));
        System.out.println(statement1);

        int statement2 = array2[1].compareToIgnoreCase("To learn");
        System.out.println(statement2);

        System.out.println(!(statement1>statement2));

        System.out.println("---------------------------------------");

    }
}
