package DAY10_StringMethodexample;

public class C3_Srtringtypeconversion {
    public static void main(String[] args) {

     String a="5";

    int b= Integer.valueOf(a);
    int c= Integer.parseInt(a);
        System.out.println(b);
        System.out.println(c);


        System.out.println(".....................");

        int d= 21;

        String h = String.valueOf(d);
        System.out.println(h);


        System.out.println("...............");

        double x = 6.50;
        int k = (int)x;
        System.out.println(k);
    }
}
