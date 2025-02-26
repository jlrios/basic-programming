package basic.sintax;

/**
  * * Print and print line.
  * * Program: 002.
  * ? Show the differences between the 'print' and 'println' instructions.
  * ? Programmer: JLRD.
  * ? Creation: 25/02/25.
  * ? Last updated: 25/02/25.
  */
public class PrintLine {
    public static void main(String... args) {
        System.out.print("This is a message using print. ");
        System.out.println("It stay on the same line.");
        System.out.println("A println() can be used as a line break.");
        
        System.out.println();

        System.out.println("This is a message using println.");
        System.out.println("Each println prints on a new line.");
        System.out.println();

        System.out.print("—Adiós —dijo el zorro—. ");
        System.out.print("He aquí mi secreto. ");
        System.out.print("Es muy simple: solo con el corazón se puede ver bien; ");
        System.out.print("lo esencial es invisible a los ojos. ");

        System.out.println();
        System.out.println();

        System.out.println("—Lo esencial es invisible a los ojos —repitió el principito para recordarlo.");
        System.out.println("—El tiempo que perdiste por tu rosa hace que tu rosa sea tan importante.");
        System.out.println("—El tiempo que perdí por mi rosa… —repitió el principito para recordarlo.");

        System.out.println();

        System.out.println("El Principito");
    }   
}