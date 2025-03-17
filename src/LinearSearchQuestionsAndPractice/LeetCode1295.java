package LinearSearchQuestionsAndPractice;

public class LeetCode1295
{
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbersStringMethod(nums));
    }
    static int findNumbersStringMethod(int[] nums)
    {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
           String value = String.valueOf(nums[i]);
           if(value.length()%2==0)
           {
               count++;
           }

        }
        return count;
    }

}
