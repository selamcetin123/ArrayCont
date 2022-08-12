package DAY24_ABAB;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class C1_Arrays {

    public static void main(String[] args) {

        ArrayList< Integer> list = new ArrayList<>();


        list.add(4);

        System.out.println(list);

        list.addAll(Arrays.asList(list));



    }
}
