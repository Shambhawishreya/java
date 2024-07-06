import java.util.*;
public class Switch {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        
        switch (button) {
            case 1: System.out.println("I am button1");
            break;

            case 2: System.out.println("I am button2");
            break;

            case 3: System.out.println("I am button3");
            break;

            default: System.out.println("Invalid button");

        }
    }
}
