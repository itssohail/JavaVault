package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimension
{
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
//        int[][] arr = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        System.out.println(arr[1][0]);
        new Multidimension().input();
    }
    void input() {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);

        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < 3; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        // Printing the 2D array
        System.out.println("Array Output:");
       for(int i =0;i<arr.length;i++)
       {
           for(int j=0;j<arr[i].length;j++)
           {
               System.out.print(arr[i][j]+" ");
           }
           System.out.println();
       }
    }
}
