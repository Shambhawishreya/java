import java.util.*;
public class CalculateSum {

    public static int calSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = sc.nextInt();

        System.out.println("Enter second number");
        int b = sc.nextInt();

        // int sum = calSum(a,b);
        // System.out.println("sum is:" +sum);

        System.out.println("sum is:" +calSum(a,b));
        
    }
}


