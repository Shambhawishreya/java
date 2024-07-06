// package Arrays;
import java.util.*;

public class Ascending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int numbers[] = new int[n];

        for(int i=0; i<n; i++){
            numbers[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for(int i=0; i<n-1; i++){
            if(numbers[i] > numbers[i+1] ) {
                isAscending = false;
            }
        }
        // System.out.println(isAscending);

        if(isAscending) {
            System.out.println("Array is in ascending order");
        }
        else {
            System.out.println("Not in ascending order");
        }
    }    
}
