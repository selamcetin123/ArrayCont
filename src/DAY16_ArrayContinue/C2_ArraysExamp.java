package DAY16_ArrayContinue;

public class C2_ArraysExamp {

    public static void main(String[] args) {


        int[] ages= { 24, 60 , 23 ,19, 45, 90};


        int sum=0;

        for (int i = 0; i <ages.length ; i++) {

            sum+=ages[i];

            
        }

        float ave= (float) sum/ages.length;

        System.out.println(" The avarage age is :" +ave);
    }
}
