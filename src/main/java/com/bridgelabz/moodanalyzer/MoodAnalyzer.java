package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {

    private String msg;

    public MoodAnalyzer(String msg) {
        this.msg = msg;
    }

    public String analyseMood() {
        if (msg != null && msg.contains("Sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }

       public static void main(String[] args) {
           System.out.println("Welcome to Mood Analyzer Problem");

           MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am feeling Sad today");

           String mood = moodAnalyzer.analyseMood();
           System.out.println("The mood is: " + mood);

       }
    }