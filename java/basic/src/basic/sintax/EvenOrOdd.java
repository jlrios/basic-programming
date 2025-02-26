package basic.sintax;

import java.util.Scanner;

/**
  * * Even or odd.
  * * Program: 007.
  * ? Even or odd number.
  * ? Programmer: JLRD.
  * ? Creation: 25/02/25.
  * ? Last updated: 25/02/25.
  */
public class EvenOrOdd {
    public static void main(String[] args) {
        int number;
        Scanner numberScan = new Scanner(System.in);

        System.out.println("Even or odd number");

        System.out.print("Enter integer number: ");
        number = numberScan.nextInt();

        if ((number % 2) == 0) {
            System.out.println("Even.");
        } else {
            System.out.println("Odd.");
        }

        numberScan.close();
    }
}