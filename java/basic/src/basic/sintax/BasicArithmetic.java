package basic.sintax;

import java.util.Scanner;

/**
  * * Basic arithmetic operations.
  * * Program: 007.
  * ? Perform the four basic arithmetic operations.
  * ? Programmer: JLRD.
  * ? Creation: 25/02/25.
  * ? Last updated: 25/02/25.
  */
public class BasicArithmetic {
    public static void main(String[] args) {
        float number1, number2;
        Scanner numberScan = new Scanner(System.in);

        System.out.println("Basic arithmetic operations.");
        
        System.out.print("Enter first number: ");
        number1 = numberScan.nextFloat();

        System.out.print("Enter second number: ");
        number2 = numberScan.nextFloat();

        System.out.println();

        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
        System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
        System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
        System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));

        numberScan.close();
    }
}