package LinearSearchQuestionsAndPractice;

public class SearchInRange
{
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int start = 1, end = 4, target = 14;
        System.out.println(search(arr, start, end, target));
    }
    static boolean search(int[] arr,int start,int end,int target)
    {
        for(int i=start;i<=end;i++)
        {
            if(arr[i]==target)
            {
                return true;
            }
        }
        return false;
    }
}
