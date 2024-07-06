// package Functions;
import java.util.*;
public class Greater {
    public static int calGreater(int a, int b) {
        int greater;
        if(a>b) {
            greater = a;
        } else {
            greater = b;
        }
        System.out.println(greater);
        return greater;
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        calGreater(a,b);
    }
}
