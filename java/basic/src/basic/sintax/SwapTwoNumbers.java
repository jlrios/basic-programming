package basic.sintax;
import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int n1, n2;
        Scanner numbers = new Scanner(System.in);

        System.out.println("Swap two numbers");

        System.out.print("Enter first number (n1): ");
        n1 = numbers.nextInt();

        System.out.print("Enter second number (n2): ");
        n2 = numbers.nextInt();

        System.out.println("Before swapping: n1 = " + n1 + ", n2 = " + n2);
        
        n1 = n1 + n2;

        System.out.println("After swapping: n2 = " + (n2 = (n1 - n2)) + ", n1 = " + (n1 = (n1 - n2)));
        
        numbers.close();
    }
}
