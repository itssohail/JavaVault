package LinearSearchQuestionsAndPractice;

import java.util.Arrays;

public class MaxIn2D
{
    public static void main(String[] args) {
        int[][] arr = {
                {23,4,1},
                {18,12,3,9},
                {78,99,32,56},
                {18,12}
        };
        System.out.println(max2D(arr));
    }
    static int max2D(int[][] arr)
    {
        int max = arr[0][0];
        for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++)
            {
                if(arr[row][col]>max)
                {
                    max=arr[row][col];
                }
            }
        }
        return max;

    }
}
