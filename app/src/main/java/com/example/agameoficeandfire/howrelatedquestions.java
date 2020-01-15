package com.example.agameoficeandfire;

public class howrelatedquestions {
    private int Quesid;
    private String Question;
    private String[] Choices;
    private String CorrectAnswer;
    private String ImageId;
    private String Text;

    public howrelatedquestions(int quesid, String question, String[] choices, String correctAnswer, String imageId, String text) {
        Quesid = quesid;
        Question = question;
        Choices = choices;
        CorrectAnswer = correctAnswer;
        ImageId = imageId;
        Text = text;
    }

    public int getQuesid() {
        return Quesid;
    }

    public String getQuestion() {
        return Question;
    }

    public String[] getChoices() {
        return Choices;
    }

    public String getCorrectAnswer() {
        return CorrectAnswer;
    }

    public String getImageId() {
        return ImageId;
    }

    public String getText() {
        return Text;
    }
}
