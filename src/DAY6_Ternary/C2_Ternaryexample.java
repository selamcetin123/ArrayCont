package DAY6_Ternary;

public class C2_Ternaryexample {
    public static void main(String[] args) {
        // Check the number if is even or odd

        int num = 89;
        String Result;

        /*
        if(num % 2 == 0){


            Result = "Even";

        }
        else Result = "Odd";

        System.out.println("The number is: "+Result);
        */

        Result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is: "+Result);
    }

}
