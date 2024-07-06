// package numberss;
import java.util.*;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int numbers[] = new int[n];

        for(int i=0; i<n; i++){
            numbers[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(numbers[i] < min ) {
                min = numbers[i];
            }
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
