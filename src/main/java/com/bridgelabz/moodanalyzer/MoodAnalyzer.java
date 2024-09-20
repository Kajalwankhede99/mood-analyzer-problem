package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {

    private String msg;

    public MoodAnalyzer(String msg) {
        this.msg = msg;
    }

    public void analyseMood(String msg) throws MoodAnalyzerException {
        this.msg = msg;
        analyseMood();
    }

    public String analyseMood() throws MoodAnalyzerException{
        try {
            if(msg.length()==0)
                throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.EMPTY,"Enter exact mood");
            if(msg.contains("SAD"))
                return "SAD";
            else
                return "HAPPY";
        }
        catch (NullPointerException e){
            throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.NULL,"Enter exact mood");
        }
    }

       public static void main(String[] args) {
           System.out.println("Welcome to Mood Analyzer Problem");

           MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am feeling Sad today");

           String mood = moodAnalyzer.analyseMood();
           System.out.println("The mood is: " + mood);

       }
    }