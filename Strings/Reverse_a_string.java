import java.util.*;
// package Strings;

public class Reverse_a_string {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");

        for(int i=0; i<sb.length()/2; i++) {
            int front = i;
            int back = sb.length() -1 -i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);

        }
        System.out.println(sb);

        int a=10;
        int b=0;
        b = a++;
        System.out.println(a);
        System.out.println(b);
    }
}
