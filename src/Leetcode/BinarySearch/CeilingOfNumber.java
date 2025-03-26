package Leetcode.BinarySearch;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18,23};
        int target = 15;
        //what does ceiling mean: Equals to or Greater than TARGET.
        System.out.println("The Next greatest element or the exact target element is at index "+ceiling(arr, target));
    }

    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if(target>end)
        {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
