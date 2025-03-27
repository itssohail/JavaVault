package ExceptionHandling.ExceptionTasks;

public class ArrayIndexOutOfBoundsExcep
{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        ArrayException(arr);
    }
    static void ArrayException(int[] arr)
    {
        try {
            for(int i=0;i<=5;i++)
            {
                System.out.println(arr[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
