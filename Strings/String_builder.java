import java.util.*;
// package Strings;

public class String_builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        //Replace
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        //Insert
        sb.insert(2, 'n');
        System.out.println(sb);

        //Delete
        sb.delete(2, 3);            //ending index is non exclusive
        System.out.println(sb);

        //Append
        sb.append("y");
        System.out.println(sb);

        //Length of string
        System.out.println(sb.length());
    }
}
