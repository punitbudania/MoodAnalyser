package com.moodanalysertest;

import com.moodanalyser.MoodAnalyser;
import com.moodanalyser.MoodAnalysisException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest
{
    @Test
    public void givenNullMoodShouldReturnHappy()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = null;
        try
        {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.excpect(MoodAnalysisException.class);
            mood = moodAnalyser.analyseMood();
            Assert.assertEquals("HAPPY",mood);
        }
        catch()
    }
}
