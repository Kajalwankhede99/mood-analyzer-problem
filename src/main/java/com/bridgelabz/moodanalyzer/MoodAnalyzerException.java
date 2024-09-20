package com.bridgelabz.moodanalyzer;

public class MoodAnalyzerException extends Exception {
    public enum ExceptionType {
        EMPTY, NULL
    }

    public ExceptionType type;

    public MoodAnalyzerException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
