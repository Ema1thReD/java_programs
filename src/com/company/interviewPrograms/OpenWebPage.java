package com.company.interviewPrograms;

import java.net.URI;
import java.net.URL;

public class OpenWebPage
{
    public static void main(String args[])
    {
        try{
            URI url=new URI("http://www.gmail.com");
            java.awt.Desktop.getDesktop().browse(url);
            System.out.println("Web page opened in browser");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
