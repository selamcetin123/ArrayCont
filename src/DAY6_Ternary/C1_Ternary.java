package DAY6_Ternary;

public class C1_Ternary {
    public static void main( String []args ) {

        int number1 = 89;
        int number2 = 50;
        int max;

        if(number1>number2){
            max = number1;
        }else max = number2;

        System.out.println("The max is: "+max);

        // Ternary max = (number1>number2) ? number1 : number2

        max = (number1>number2) ? number1 : number2;
        System.out.println("This is the second line: " +max);



    }
}
