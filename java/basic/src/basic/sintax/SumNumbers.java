package basic.sintax;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String... args) {
        int result = 0;
        int readNumber = 0;
        Scanner number = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        readNumber = number.nextInt();

        for (int i = 1; i <= readNumber; i++) {
            result += i;
        }

        System.out.println("The sum of the entered numbers is: " + result);

        number.close();
    }
}