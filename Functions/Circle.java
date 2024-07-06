// package Functions;
import java.util.*;
import java.lang.Math;

public class Circle {
    public static double calPerimeter(double r) {
        double perimeter = 2 * Math.PI * r;
        System.out.println(perimeter);
        return perimeter;
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();

        calPerimeter(r);
    }
}
