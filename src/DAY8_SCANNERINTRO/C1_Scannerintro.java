package DAY8_SCANNERINTRO;


import java.util.Scanner;

public class C1_Scannerintro {

    public static void main(String[] args) {
       /*
        System.out.println(" welcome to our page");

        Scanner scan = new Scanner(System.in);
        System.out.println(" What is your first name:");

        String name= scan.next();

        System.out.println(" first name is :" +name);
        */

        //scanner is a library under java
        //this library has ready methods that you can use it
        //to be able to use this library we need to call them in our class
        //and create object from that library

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        byte byteNumber = sc.nextByte();

        //System.out.println("The byteNumber is : "+byteNumber);


    }
}
