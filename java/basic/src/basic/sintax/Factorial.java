package basic.sintax;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int number, aux, factorial;
        Scanner numberScan  = new Scanner(System.in);

        System.out.println("Find factorial.");

        System.out.print("Enter number: ");
        number = numberScan.nextInt();

        aux = number;
        factorial = aux;

        for (int f = number; f >= 2; f--) {
            factorial = factorial * (aux - 1);
            aux--;
        }

        System.out.println(number + "! = " + factorial);
        numberScan.close();
    }
}
