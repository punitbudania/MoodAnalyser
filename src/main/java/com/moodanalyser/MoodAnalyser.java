package com.moodanalyser;

import java.util.Scanner;

public class MoodAnalyser
{
    static String message;

    public static void main(String[] args)
    {
        System.out.println("Pass your message:");
        Scanner msg = new Scanner(System.in);
        message = msg.nextLine();
        System.out.println(analyseMood());
    }
/*
    public MoodAnalyser(String message)
    {
        this.message = message;
    }
*/


    public static String analyseMood()
    {
        if (message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
        /*
        catch(NullPointerException e)
        {
            //throw new MoodAnalysisException("Please enter proper message");
        }

         */
    }
}
