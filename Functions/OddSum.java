// package Functions;
import java.util.Scanner;

public class OddSum {
     public static void calSum(int n) {
        if(n % 2 != 0) {
            int sum=0;
        for(int i=1; i<=n; i++) {
            if(i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
        } else {
            System.out.println("Not a odd number");
        }   
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        calSum(n);
    }
}
