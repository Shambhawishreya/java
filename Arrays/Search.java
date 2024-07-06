// package Arrays;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();                    
        int array[] = new int [size];

        System.out.println("Enter the elements of array");
        for(int i=0; i<size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the number to search");
        int x = sc.nextInt();

        for(int i=0; i<array.length; i++) {                   //array.length = size of array
            if(x == array[i] ) {
                System.out.println("Index is: " +i);
            }
        }  
    }
}
