package Day14_DoWhileAndNestedLoop;

public class C4_WhileNested {
    public static void main(String[] args) {

        int i= 0;

        while (i<2){

            i++;

            System.out.println(" from the outer loop i value : " +i);

            int j = 0;
            while ( j<2 ){

                j++;

                System.out.println( "     from inner Loop j value : " +j);
                int sum = j+ i;

            }
        }



    }




}
