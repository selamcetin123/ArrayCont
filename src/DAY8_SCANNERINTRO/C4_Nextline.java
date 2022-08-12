package DAY8_SCANNERINTRO;
import java.util.Scanner;

public class C4_Nextline {

    public static void main(String[] args) {
        // 2) nextLine() this will read everything on the line and assign it to String:
        Scanner fullName = new Scanner(System.in);
        System.out.println("Please enter your name: ");

        String name1 = fullName.nextLine();

        System.out.println("The Full name is: " +name1);


        System.out.println("Please enter your full name: ");
        String name2 = fullName.nextLine();
        System.out.println("The Full name is: " +name2) ;


        System.out.println(" enter :" +name2);
    }


}
