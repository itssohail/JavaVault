package LinearSearchQuestionsAndPractice;

public class RichestCustomerWealth
{
    public static void main(String[] args) {
        int[][] arr={{1,5},{7,3},{3,5}};
        System.out.println(highest(arr));
    }
    static int highest(int[][] arr)
    {
        int ans=0;
        for(int row=0;row<arr.length;row++)
        {
            int sum=0;
            for(int col=0;col<arr[row].length;col++)
            {
                sum=sum+arr[row][col];
            }
            if(sum>ans)
                ans=sum;
        }
        return ans;
    }

}
