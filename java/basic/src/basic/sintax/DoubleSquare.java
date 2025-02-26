package basic.sintax;

import java.util.Scanner;

/**
  * * Double, square.
  * * Program: 005.
  * ? Given an integer, obtain its double and its square power.
  * ? Programmer: JLRD.
  * ? Creation: 25/02/25.
  * ? Last updated: 25/02/25.
  */
public class DoubleSquare {
    public static void main(String[] args) {
        int doubleSquare = 0;
        Scanner numberScan = new Scanner(System.in);

        System.out.println("Given an integer, obtain its double and its square power");

        System.out.print("Enter an integer number: ");
        doubleSquare = numberScan.nextInt();

        System.out.println("Double = " + (doubleSquare + doubleSquare));
        System.out.println("Square = " + (doubleSquare * doubleSquare));

        numberScan.close();
    }
}