package LinearSearchQuestionsAndPractice;

public class CharSearchInString
{

    public static void main(String[] args) {
        String name ="sohail";
        char target='l';
        System.out.println(searchChar(name,target));
        System.out.println(toCharArray(name,target));
    }
    static boolean searchChar(String str, char target)
    {
       if(str.isEmpty())
           return false;
        for(int i=0;i<str.length();i++)
        {
                if(str.charAt(i)==target)
            {
                return true;
            }
        }
        return false;
    }
    static boolean toCharArray(String name,char target)
    {
        for(char ch:name.toCharArray())
        {
            if(ch==target)
            {
                return true;
            }
        }
        return false;
    }
}
