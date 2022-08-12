package DAY11_ForLoopIntroduction;

import java.util.Scanner;

public class C4_ForLoopExample {
    public static void main(String[] args) {

        Scanner scn= new Scanner(System.in);


        System.out.println(" Please enter a String");
        String fromscn= scn.next();


        for (int i = 0; i < fromscn.length() ; i++) {


            System.out.println(i);

        }






    }
}
