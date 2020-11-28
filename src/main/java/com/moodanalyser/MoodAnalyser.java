package com.moodanalyser;

import java.util.Scanner;

public class MoodAnalyser
{
    static String message;

    public static void main(String[] args) throws MoodAnalysisException {
        System.out.println("Pass your message:");
        Scanner msg = new Scanner(System.in);
        message = msg.nextLine();
        System.out.println(analyseMoodAgain());
    }

    public MoodAnalyser()
    {

    }

    public MoodAnalyser(String message)
    {
        this.message = message;
    }

    public static String analyseMood()
    {
        try
        {
            return analyseMoodAgain();
        }
        catch (MoodAnalysisException e)
        {
            return "HAPPY";
        }
    }

    public static String analyseMoodAgain() throws MoodAnalysisException {
        try
        {
            if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        }
        catch(NullPointerException e)
        {
            throw new MoodAnalysisException("Please enter proper message");
        }
    }
}
