package BinarySearchCodeAndTheory;

public class OrderAgnostic
{
    public static void main(String[] args) {
//        int[] arr={2,4,6,8,9,24,29,34,39,43};
        int[] arr={45,23,21,19,15,13,12,9,4};
        int target=21;
        int ans=orderBs(arr,target);
        System.out.println("Element found at index "+ans);
    }
    static int orderBs(int[]arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        //find whether the array is ascending or descending
        boolean isAsc;
        if(arr[start]<arr[end])
        {
            isAsc=true;
        }else {
            isAsc=false;
        }
        while(start<=end)
        {

            int middle=(start+end)/2;

            if(arr[middle]==target)
            {
                return middle;
            }

            if(isAsc) {
                if (target > arr[middle]) {
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
            }else {
                if(target<arr[middle])
                {
                    start=middle+1;
                }
                else
                {
                    end=middle-1;
                }

            }

        }
        System.out.println("Elemet is not present in array");
        return -1;
    }

}
