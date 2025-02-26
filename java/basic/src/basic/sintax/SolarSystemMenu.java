package basic.sintax;

import java.util.Scanner;

/**
  * * Solar System Menu.
  * * Program: 009.
  * ? Basic text-based options menu.
  * ? Programmer: JLRD.
  * ? Creation: 25/02/25.
  * ? Last updated: 25/02/25.
  */
public class SolarSystemMenu {
    public static void main(String args[]) {
        char option = ' ';
        Scanner optionScan = new Scanner(System.in);

        while(option != 'X') {
            System.out.println();
            System.out.println("\tThe Solar System");
            System.out.println("\t================");
            System.out.println("\t[S] Sun");
            System.out.println("\t[M] Mercury");
            System.out.println("\t[V] Venus");
            System.out.println("\t[E] Earth");
            System.out.println("\t[A] Mars");
            System.out.println("\t[J] Jupiter");
            System.out.println("\t[S] Saturn");
            System.out.println("\t[U] Uranus");
            System.out.println("\t[N] Neptune");
            System.out.println("\t[X] Exit Solar System");
            System.out.println("\t================");
            
            System.out.print("\tWhat is your option?: > ");
            option = optionScan.next().charAt(0);

            System.out.println();
        }
        optionScan.close();
    }
}
