package com.bridgelabz.buttonsview;

import java.util.Random;

/**
 * Created by bridgelabz1 on 18/8/16.
 */
public class RandomNumbers {
    public static void main(String arg[])
    {
        int arr[] = new int[3];
        int i;
        /*int maximum = 9, minimum=1,randomNum;
        Random rn = new Random();
        int n = maximum - minimum + 1;
        System.out.println("n = "+n);
        int next = rn.nextInt();
        System.out.println("next = "+next);
        int i = next % n;
        System.out.println("i = "+i);
        randomNum =  minimum + i;
        System.out.println("random num:" +randomNum);*/
        while (arr[0]==arr[1] || arr[0]==arr[2] || arr[1] == arr[2] || arr[0]<=0 || arr[1]<=0 || arr[2]<=0)
        {
            for(i=0; i<3; i++)
            {
                arr[i] = randomNumberGeneration(9,1);
            }
            System.out.println(arr[0]+"\t"+arr[1]+"\t"+arr[2]);
        }
    }
    static int randomNumberGeneration(int max, int min)
    {
        Random rn = new Random();
        int a = max - min +1;
        int b = rn.nextInt() % a;
        int randNum = min+b;
        return randNum;
    }
}
