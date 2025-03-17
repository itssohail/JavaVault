package LinearSearchQuestionsAndPractice;

public class FindElement
{
    public static void main(String[] args) {
        int[] arr={18,12,9,14,77,50};
        int element=14;
        find(arr,element);
        System.out.println(find(arr,element));
    }
    static boolean find(int[] arr,int element)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==element)
                return true;
        }
        return false;
    }


}
