package PassByValuePassByReference;

import java.util.ArrayList;
import java.util.Arrays;

public class PassBy
{
     static void meth1(int num)
    {
        num=99;

    }
    static void array(int[] arr)
    {
        int temp=arr[0];
        arr[0]=arr[1];
        arr[1]=temp;
    }

    public static void main(String[] args) {
        int num = 10;
        meth1(num);

        int[] arr={1,3,4};
        array(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(num);

    }
}
