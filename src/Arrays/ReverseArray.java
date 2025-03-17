package Arrays;

import java.util.Arrays;

public class ReverseArray
{
    public static void main(String[] args) {
        int[] arr={1,3,23,9,18};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
//         reverse(arr);
//        for(int i=arr.length-1;i>=0;i--)
//        {
//            System.out.print(arr[i]+" ");
//        }

    }
    static void reverse(int[] arr)
    {
         int start=0;
         int end=arr.length-1;
         while(start<end)
         {
            swap(arr,start,end);
            start++;
            end--;
         }

    }
    static void swap(int[] arr,int start,int end)
    {
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }


    void meth1()
    {

    }

}
