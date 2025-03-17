package Arrays.ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalArrayLists
{

   static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {

      ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        System.out.println("empt :"+ al);
        for(int i=0;i<3;i++)
        {
            al.add(new ArrayList<>());
        }
        System.out.println(al);
        System.out.println(al.size());

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                al.get(i).add(MultiDimensionalArrayLists.sc.nextInt());
            }
        }
        System.out.println(al);

    }
}
