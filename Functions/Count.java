import java.util.*;

public class Count {

   public static void main(String args[]) {
    int postive=0, negative=0, zeroes=0;

    System.out.println("Enter 1 to continue or 0 to exit");

    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();

   while (input == 1) {
    System.out.println("Enter any number");
    int n = sc.nextInt();

    if(n>0) {
        postive++;
    } 
    else if (n<0) {
        negative++;
    }
    else {
        zeroes++;
    }
    System.out.println("Enter 1 to continue or 0 to exit");
    input = sc.nextInt();
   }
   
   System.out.println("Positives: " +postive);
   System.out.println("Negatives: " +negative);
   System.out.println("Zeroes: " +zeroes);
   }  

}
