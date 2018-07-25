package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordRepeatedCount
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the words for count");
        String input=br.readLine();
        String[] words=input.split(" ");//Entered Input split by space word wise
        int wrc=1;

        for(int i=0;i<words.length;i++)   //loop starts here
        {
            for(int j=i+1;j<words.length;j++)
            {
                if(words[i].equals(words[j]))
                {
                    wrc = +1;
                    System.out.println("wrc count"+wrc);
                    words[j] = "0";
                    System.out.println("words[j]"+words[j]);
                }
            }
            if(words[i]!="0")
            {
                System.out.println(words[i]+"--"+wrc);
                wrc=1;
            }
        }
    }
}
