package GenericsObjectComparisionExceptionHandling.ObjectComparision.Comparable.Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class StringLength
{
    public static void main(String[] args) {
        String[] words={"sohail","arun","jahnavika","pratheeka"};
        Comparator<String> com = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
               if(s1.length()>s2.length())
                return 1;
               if(s1.length()==s2.length()) return 0 ;
               else return -1;
            }
        };
        Arrays.sort(words,com);
        System.out.println(Arrays.toString(words));

    }
}
