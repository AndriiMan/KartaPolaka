package com.example.kartapolaka;


public class Information {
    private String question;
    private String answer;
    private int image;

    public Information(String question, String answer, int image) {
        this.question = question;
        this.answer = answer;
        this.image = image;
    }

    public Information(String question, String answer) {
        this.question = question;
        this.answer = answer;
        this.image = 0;
    }

    public Information() {
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
