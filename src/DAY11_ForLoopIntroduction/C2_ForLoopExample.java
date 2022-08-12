package DAY11_ForLoopIntroduction;

public class C2_ForLoopExample {
    public static void main(String[] args) {


        for (int i = 1; i < 100 ; i++) {

            System.out.println("the value of i :" +i);

        }





        for (int i = 1; i < 100 ; i+=2) {

           System.out.println("the value of i :" +i);

        }


        int count=0;

        for (int i = 1; i < 100 ; i+=2) {

            System.out.println("the value of i :" +i);
            count++;
        }
        System.out.println(count);
    }
}
