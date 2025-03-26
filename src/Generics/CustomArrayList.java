package Generics;

import java.util.ArrayList;

public class CustomArrayList
{
    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public CustomArrayList()
    {
        this.data=new int[DEFAULT_SIZE];
    }
//    public void add(int number)
//    {
//        if(isFull)
//        {
//            resize();
//        }
//        data[size++]=number;
//    }

    private void resize()
    {
        int[] temp=new int[data.length*2];
        //copy the current items into new array
        for(int i=0;i<data.length;i++)
        {
            temp[i]=data[i];
        }
        data=temp;
    }

    private boolean isFull()
    {
        return size==data.length;
    }
    

    public static void main(String[] args) {

    }
}