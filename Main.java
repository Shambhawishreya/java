import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World with Java");
        System.out.print("Hello World");
        System.out.print("Hello World\n");
        System.out.println("Hello World\n");
        System.out.println("Hello World\nfrom \nme");

        //Data Types : Primitive and Non-Primitive
        String name = "Elena";
        int age = 18;
        double price = 25.25;

        System.out.println(name);

        //variables
        int a = 10;
        int b = 25;
        int sum = a + b;
        int mul = a * b ;
        System.out.println(sum);
        System.out.println(mul);

        //Input in java
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        //nextInt()
        //nextFloat()
        System.out.println(name1);


    }
}