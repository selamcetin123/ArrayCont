package DAY13_WhileLoop;

import java.util.Scanner;

public class C2_WhileLoopExample {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Please enter a number ");

        int num = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < num ; i++) {

            if (sum+i<=390){
                sum= sum+i;

            }else {
                break;
            }

        }





    }


}
