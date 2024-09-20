package com.bridgelabz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void givenMessage_WhenSad_ShouldReturn_Sad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is Sad Message");
        try {
            Assert.assertEquals("SAD", moodAnalyzer.analyseMood());
        } catch (MoodAnalyzerException e) {
        }
    }

    @Test
    public void givenMessage_WhenNotSad_ShouldReturn_Happy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is Happy Message");
        try {
            Assert.assertEquals("HAPPY", moodAnalyzer.analyseMood());
        } catch (MoodAnalyzerException e) {
        }
    }

    @Test
    public void nullMood_ShouldReturn_Happy() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void nullMood_ThrowException() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        try {
            moodAnalyzer.analyseMood(null);
        } catch (MoodAnalyzerException e) {
            Assert.assertEquals(MoodAnalyzerException.ExceptionType.NULL, e.type);
        }
    }
}