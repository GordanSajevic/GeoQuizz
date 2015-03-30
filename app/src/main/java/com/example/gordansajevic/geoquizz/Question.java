package com.example.gordansajevic.geoquizz;

/**
 * Created by gordansajevic on 30/03/15.
 */
public class Question {

    private int mQuestionId;
    private boolean mAnswer;

    public Question(int mQuestionId, boolean mAnswer) {
        this.mQuestionId = mQuestionId;
        this.mAnswer = mAnswer;
    }

    public int getQuestionId() {
        return mQuestionId;
    }

    public boolean isAnswer() {
        return mAnswer;
    }
}
