package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0]=23;
        arr[1]=45;
        arr[2]=26;
        arr[3]=47;
        arr[4]=41;
        System.out.println(arr[3]);
        //iput using for loops
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //directly get the element withotu index
        System.out.println("Enhanced for loop");
        for(int x:arr)
        {

            System.out.print(x+" ");
        }
    }
}
