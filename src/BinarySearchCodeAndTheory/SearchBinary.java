package BinarySearchCodeAndTheory;

public class SearchBinary
{
    public static void main(String[] args) {
        int[] arr={2,4,6,8,9,24,29,34,39,43};
        int target= 4;
       int ans=search(arr,target);
        System.out.println("The target is found at index:"+ans);
    }
    static int search(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int middle=start+(end-start)/2;
            if(target>arr[middle])
            {
                start=middle+1;
            }
             else if(target<arr[middle])
            {
                end=middle-1;
            }
            else {
                return middle;
            }
        }
        System.out.println("This element doesnt not exist");
        return -1;
    }

}
