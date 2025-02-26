package basic.sintax;

import java.util.Scanner;

/**
  * * Greeting.
  * * Program: 004.
  * ? Print a customized greeting.
  * ? Programmer: JLRD.
  * ? Creation: 25/02/25.
  * ? Last updated: 25/02/25.
  */
public class Greeting {
    public static void main(String[] args) {
        String myName;
        Scanner nameScan = new Scanner(System.in);

        System.out.println("Print a customized greeting");

        System.out.print("What is your name: ");
        myName = nameScan.nextLine();
        System.out.println("Nice to meet you. Welcome, " + myName);

        nameScan.close();
    }
}