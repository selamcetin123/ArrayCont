package DAY12_BreakStetement;

public class C2_Continue {

    public static void main(String[] args) {


        for (int i = 0; i < 50 ; i++) {

            if ( i==3 || i==6 || i==9) {

             continue;
            }
            System.out.println(i);

        }
    }
}
