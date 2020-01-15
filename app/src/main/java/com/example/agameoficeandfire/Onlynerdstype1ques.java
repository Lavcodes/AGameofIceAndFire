package com.example.agameoficeandfire;

public class Onlynerdstype1ques {
    private int Quesid;
    private String Question;
    private String[] AnswerPossibilities;
    private String ImageId;
    private String Text;

    public Onlynerdstype1ques(int quesid, String question, String[] answerPossibilities, String imageId, String text) {
        Quesid = quesid;
        Question = question;
        AnswerPossibilities = answerPossibilities;
        ImageId = imageId;
        Text = text;
    }

    public int getQuesid() {
        return Quesid;
    }

    public String getQuestion() {
        return Question;
    }

    public String[] getAnswerPossibilities() {
        return AnswerPossibilities;
    }

    public String getImageId() {
        return ImageId;
    }

    public String getText() {
        return Text;
    }
}




