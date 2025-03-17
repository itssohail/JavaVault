package LinearSearchQuestionsAndPractice;

public class SearchInStrings
{
    public static void main(String[] args) {
            String[] arr={"sohail","kunal","lovely"};
            String target="sohaill";
        System.out.println(search(arr,target));
    }
    static boolean search(String[] arr, String target)
    {
        for(int i=0;i<arr.length;i++)
        {

            if(arr[i].equals(target))
            {
                return true;
            }
        }
        return false;
    }

}
