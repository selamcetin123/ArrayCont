package DAY5_IFSTATEMENTS;

public class C2_Ifstatementcon {
    public static void main(String[] args ){


            int number1 = 199;
            int number2 = 27;
            int number3 = 189;

        /*
        boolean bool1 = number1>number2 && number1>number3;
        boolean bool2 = number2>number1 && number2>number3;
        boolean bool3 = number3>number1 && number3>number2;

         */

            if(number1>number2 && number1>number3){

                System.out.println("The max number is: " +number1);

            }

            if(number2>number1 && number2>number3){

                System.out.println("The max number is: " +number2);

            }

            if(number3>number1 && number3>number2){

                System.out.println("The max number is: " +number3);
    }
            if( number1<number2 && number2>number3){
                System.out.println(" the mininum number is : " + number2);
            }

    }
    }