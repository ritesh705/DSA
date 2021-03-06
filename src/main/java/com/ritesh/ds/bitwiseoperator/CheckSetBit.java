package com.ritesh.ds.bitwiseoperator;

public class CheckSetBit
{
    public static void main(String[] args)
    {
        int x = 5;
        int k = 2;
        boolean isBitSet = isBitSet(x, k);
        System.out.println("Is Kth Bit Set : "+isBitSet);
    }

    private static boolean isBitSet(int x, int k)
    {
        boolean isBitSet = false;
        // Generate a number whose kth bit se
        int genNumber = 1<<(k-1);
        // bitwise & of x and genNumber
        int newNumber = x & genNumber;
        if(newNumber!=0)
        {
            isBitSet = true;
            System.out.println(newNumber);
        }
        return isBitSet;
    }
}
