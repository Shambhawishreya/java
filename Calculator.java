import java.util.*;
public class Calculator {
    public static void main(String[]args) {

        int result;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the operator: ");
        char operator = sc.next().charAt(0);

        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        
        switch (operator) {
            case '+': result = num1+num2;
                      System.out.println(num1 + "+" +num2 + "=" +result);
            break;

            case '-': result = num1-num2;
                      System.out.println(num1 + "-" +num2 + "=" +result);
            break;

            case '/': result = num1%num2;
                      System.out.println(num1 + "/" +num2 + "=" +result);
            break;

            case '*': result = num1*num2;
                      System.out.println(num1 + "*" +num2 + "=" +result);
            break;

            default: System.out.println("Invalid operator!");

        }
    }
}

