package DAY16_ArrayContinue;

import java.util.Scanner;

public class C1_ArraysCont {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println(" Please enter a string");
        String input = sc.next();


        for (int i = 0; i <= input.length() -3 ; i++) {


            String sub= input.substring (i,i+3);

            System.out.println(" The subString is :" +sub);
            String reservesub = "";


            for (int j = 0; j <sub.length()-1 ; j--) {


                    reservesub= reservesub+sub.charAt(j);

                
            }
        }





    }
}
