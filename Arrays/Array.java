// package Arrays;
import java.util.*;

public class Array {
    public static void main(String[] args) {

        //Initializing
        // int marks[] = new int[3];
        // int[] marks = new int[3];
        // int marks[] = {97, 93, 95};

        //Accessing
        // marks[0] = 97;
        // marks[1] = 93;
        // marks[2] = 95;

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        // for(int i=0; i<3; i++) {
        //     System.out.println(marks[i]);
        // }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        System.out.println("Enter the elements of array");
        int numbers[] = new int[size];

        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }

        for(int i=0; i<size; i++) {
            System.out.println(numbers[i]);
        }
    }
}
