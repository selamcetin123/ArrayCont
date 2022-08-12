package DAY6_Ternary;

public class C5_NestedIfstatement {

    public static void main(String[] args) {

        // if number is zer just print
        // if number is even and less than 50 double it
        // if number us odd and less than 70 triple

        int number  = 10;

        if (number == 0){

            System.out.println("The number is: " +number);
        }
        else if(number % 2 == 0 ){
            number = number*2;

            if (number<50){
                number = number *2;

            }
            else{
                number = number*4;

            }
        }
        else{
            if(number<70){
                number = number*3;
            }
            else {
                number=number*6;
            }
        }
        System.out.println(number);


        int boy, girl ;
        boy=18;
        girl=68;

        if( boy>10 && girl<60) {
            System.out.println( " you can enter ");

        } else if (boy<20 && girl==70) {
            System.out.println(" maybe you can be entered ");

        } else {
            System.out.println("you can not enter");
        }
    }
}
