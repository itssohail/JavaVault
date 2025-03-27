package GenericsObjectComparisionExceptionHandling.ObjectComparision.Comparable.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo
{
    public static void main(String[] args) {
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if(i%10>j%10)
                    return 1;
                else return -1;
            }
        };
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(49);
        nums.add(77);
        nums.add(56);
        nums.add(43);
        nums.add(32);
        // to sort
//        Collections.sort(nums);

        //to have our own login we can use comparator
        Collections.sort(nums, com);
        System.out.println(nums);
    }
}
