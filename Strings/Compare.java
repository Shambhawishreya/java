import java.util.*;
// package Strings;

public class Compare {
    public static void main(String[] args) {
        // Comparing Strings
        String name1 = "cello";
        String name2 = "hello";

        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Not equal");
        }

        //substring
        String sentence = "My name is sham";
        String result = sentence.substring(11, sentence.length());
        String result2 = sentence.substring(3 );
        System.out.println(result);
        System.out.println(result2);

        //Strings are immutable
    }
}