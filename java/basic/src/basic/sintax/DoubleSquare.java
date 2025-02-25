package basic.sintax;

import java.util.Scanner;

public class DoubleSquare {
    public static void main(String[] args) {
        int doubleSquare = 0;
        Scanner myNumber = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        doubleSquare = myNumber.nextInt();

        System.out.println("Double = " + (doubleSquare + doubleSquare));
        System.out.println("Square = " + (doubleSquare * doubleSquare));

        myNumber.close();
    }
}