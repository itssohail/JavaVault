package Arrays.ArrayLists;

import java.util.Arrays;

public class Swap
{
    public static void main(String[] args) {
        int[] arr={1,3,23,9,18};
        System.out.println(arr);
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }
   static void swap(int[] arr,int index1,int index2)
   {
       System.out.println(arr);
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;


   }


}
