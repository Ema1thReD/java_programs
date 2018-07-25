package com.company;

import java.awt.image.ImagingOpException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class DuplicateWordsRemove
{
        public static void main(String[] args) throws IOException{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String s=br.readLine();
            System.out.println("Original Input is "+s);
            Pattern p=Pattern.compile("\\b(\\w+)\\b\\s+\\b\\1\\b",Pattern.MULTILINE+Pattern.CASE_INSENSITIVE);
            
        }
}
