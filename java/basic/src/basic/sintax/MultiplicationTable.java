package basic.sintax;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String args[]) {
        int number = 0;
        Scanner numberScan = new Scanner(System.in);

        System.out.println ("Generate a multiplication table for a given number.");
        
        System.out.print("Enter an integer number: ");
        number = numberScan.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        numberScan.close();
    }
}