package Leetcode.BinarySearch;

public class FloorOfNumber
{
    public static void main(String[] args) {
        int [] arr={2, 3, 5, 9, 14, 16, 18,23};
        int target=24;
        System.out.println("The Smallest element (floor) or the exact element is found at index "+floor(arr,target));
    }
    static int floor(int[] arr, int target)
    {
        int start=0;
        int end=arr.length-1;
        if(target>end)
        {
            System.out.println("The element is greater than the Greatest Element inside the array. Sorry boss ");
            return -1;
        }
        while(start<=end)
        {
            int middle=start+(end-start)/2;
            if(target>arr[middle])
            {
                start=middle+1;
            } else if (target<arr[middle])
            {
                end=middle-1;
            }
            else
            {
                return middle;
            }
        }
        return end;
    }
}
