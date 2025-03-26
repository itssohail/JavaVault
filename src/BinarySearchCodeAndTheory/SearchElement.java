package BinarySearchCodeAndTheory;

public class SearchElement
{
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 9, 11, 13, 15, 16, 48};
        int target = 11;

        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Target found at position " + result);
        }
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;
            System.out.println("Middle index: " + middle + " | Value: " + arr[middle]);

            if (target > arr[middle]) {
                start = middle + 1;
            } else if (target < arr[middle]) {
                end = middle - 1;
            } else {
                return middle;  // Target found
            }
        }

        return -1;  // Target not found
    }
}