// package Arrays;
import java.util.*;
public class Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        String names[] = new String[n];
        
        //Input
        System.out.println("Enter names");
        for(int i=0; i<n; i++) {
            names[i] = sc.next();
        }

        //Display
        for(int i=0; i<n; i++) {
            System.out.println(names[i]);;
        }
    }
}
