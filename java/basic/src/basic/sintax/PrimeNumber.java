package basic.sintax;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int prime, isPrime = 0;
        Scanner numberScan = new Scanner(System.in);

        System.out.println("Determine if a number is a prime number");

        System.out.print("Enter number: ");
        prime = numberScan.nextInt();

        for (int n = 1; n <= prime; n++) {
            if (prime % n == 0) isPrime++;
        }

        if (isPrime == 2)
            System.out.println("The number " + prime + " is a prime number");
        else
            System.out.println("The number " + prime + " is not a prime number");

        numberScan.close();
    }
}