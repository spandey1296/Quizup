package com.example.quizup;

public class TrueFalse {

    private int mQuestionID;
    private boolean mAnswer;


    public TrueFalse(int questionResourceID, boolean trueOrFalse) {
        mQuestionID = questionResourceID;
        mAnswer = trueOrFalse;
    }


    public int getQuestionID() {
        return mQuestionID;
    }


    public boolean isAnswer() {
        return mAnswer;
    }








}
