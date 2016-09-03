package com.bridgelabz.buttonsview;

import java.util.Random;

/**
 * Created by Nadimuddin on 18/8/16.
 */
public class RandomNumbers
{
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
        int k;
        while (arr[0]==arr[1] || arr[0]==arr[2] || arr[1] == arr[2] || arr[0]<=0 || arr[1]<=0 || arr[2]<=0)
        {
            k=1;
            for(i=0; i<3; i++)
            {
               // System.out.println("k pre "+k);
                arr[i] = randomNumberGeneration(k, k+2);

                k+=3;
                System.out.println("k "+k);
            }
            System.out.println(arr[0]+"\t"+arr[1]+"\t"+arr[2]);
        }
        int num=10;
        num-=num;
        System.out.println("Number----------"+num);
    }
    static int randomNumberGeneration(int min, int max)
    {
        Random rn = new Random();
        int a = max - min+1;
        int b = rn.nextInt(max) % a;
        int randNum = min+b;
        System.out.println("min:"+min +"  max:"+max+"  random:"+randNum+" rannn:"+b);
        return randNum;
    }
}
