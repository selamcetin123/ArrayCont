package DAY11_ForLoopIntroduction;

public class C2_ReverseStrings {

    public static void main(String[] args) {

        String canrem= "Hello ";

        canrem.charAt(0);

        System.out.println(canrem.charAt(0));

        System.out.println("..........");

        System.out.println(canrem.charAt(canrem.length()-1));
        System.out.println(canrem.charAt(canrem.length()-2));
        System.out.println(canrem.charAt(canrem.length()-3));
        System.out.println(canrem.charAt(canrem.length()-4));
        System.out.println(canrem.charAt(canrem.length()-5));
        System.err.println(canrem.charAt(canrem.length()-6));

        for (int banu = canrem.length()-2; banu > 0; banu--)



            System.out.println(banu);

        }



    }

