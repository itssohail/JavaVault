package Arrays;

public class MaxAndMinArray
{
    static int max(int[] arr)
    {
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args)
    {
        int[] arr={32,232,244,1,42};
        System.out.println(" max "+max(arr));
        System.out.println("min "+min(arr));
        System.out.println("Within range "+range(arr,1,3));
    }
    static int min(int[] arr)
    {
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }

    static int range(int[] arr,int start,int end)
    {
        int max=arr[start];
        for(int i=start;i<=end;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }


}
