package Arrays.ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(10);
        ///cannot pass prmitives
        //pass the wrapper classes.
        list.add(10);
        list.add(90);
        list.add(323);

        boolean istrue = list.contains(32);
        System.out.println(istrue);

        list.set(0,99);

        list.remove(2);
        System.out.println(list);

        for(int i=0;i<5;i++)
        {
            list.add(sc.nextInt());
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(list.get(i));
        }

    }
}
