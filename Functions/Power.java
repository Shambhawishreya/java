// package Functions;
import java.util.*;
import java.lang.Math;

public class Power {
    public static void calPower(int x, int n) {
        double result = Math.pow(x,n);
        System.out.println(result);
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        calPower(x,n);
    }
}
