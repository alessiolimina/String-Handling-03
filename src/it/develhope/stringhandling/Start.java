package it.develhope.stringhandling;

import java.lang.reflect.Array;

public class Start {

    public static void main(String[] args) {

        String[] array1 = {" I want ", " to learn ", " how to code! "};

        String[] array2 = {" I want ".trim(), " to learn ".trim(), " how to code! ".trim()};

        int statement1 = (array2[1].compareTo(array1[1]));
        System.out.println(statement1);

        int statement2 = array2[2].compareToIgnoreCase(array1[2]);
        System.out.println(statement2);

        System.out.println(!(statement1>statement2));

    }
}
/*
define array1 that contains the following strings:
" I want "
" to learn "
" how to code! "
remove all the whitespaces at the beginning and at the end of each string, assigning the new values to array2
print the boolean result of !(statement1 > statement2), where
statement1 corresponds to the lexicographical comparison between the first item of array2 and I want
statement2 corresponds to the comparison ignoring the case of the second item of array2 and To learn
 */