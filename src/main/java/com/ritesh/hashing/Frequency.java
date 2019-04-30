package com.ritesh.dsa.hashing;

public class Frequency
{
    private static void findFrequencyOfCharacter(String str)
    {
        Integer[] indexArray = new Integer[26];
        
        for(int i = 0; i < 26; i++) 
        {
        	indexArray[i] = 0;
        }
        
        for(int i = 0; i < str.length(); i++)
        {
            int hashcode = getHashCode(str.charAt(i));
            indexArray[hashcode]++;
        }

        for(int i = 0; i < 26; i++)
        {
            System.out.println("Frequecy of "+(char)(i+97)+" is "+indexArray[i]);
        }
    }

    private static int getHashCode(char c)
    {
        int hashCode = 0;
        hashCode = c-97;
        return hashCode;
    }

    public static void main(String[] args)
    {
        String str = "ababababacdefklhaslkhflk";
        findFrequencyOfCharacter(str);
    }
}