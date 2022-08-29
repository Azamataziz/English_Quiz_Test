package uz.azamat.lesson_6_test_app.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class GameController {
    private ArrayList<QuestionData> questionDataArrayList;
    private int position = 0;
    private int totalCorrects = 0;
    private int totalMistakes = 0;
    private Date startDate;
    private Date endDate;

    public GameController(ArrayList<QuestionData> questionData) {
        this.questionDataArrayList = questionData;
    }

    public void startGame() {
        startDate = new Date();
    }


    public void endGame() {
        endDate = new Date();
    }

    public String getTotalTime() {

        long deltaTime = Math.abs(startDate.getTime() - endDate.getTime());
//        1000 000 000
//        aa:aa:aa:aa

        long second = deltaTime / 1000 % 60;
        long minute = deltaTime / 1000 / 60 % 60;
        long hour = deltaTime / 1000 / 60 / 60 % 24;

        String result = String.format("%02d:%02d:%02d", hour, minute, second);

        return result;
    }


    private QuestionData getCurrentQuestion() {
        return questionDataArrayList.get(position);
    }

    public String getQuestion () {
        return getCurrentQuestion().getQuestion();
    }

    public ArrayList<String> getVariant() {
        Collections.shuffle(getCurrentQuestion().getVariantArrays());
        return getCurrentQuestion().getVariantArrays();
    }

    public int getTotalMistakes() {
        return totalMistakes;
    }

    public int getTotalCorrects() {
        return totalCorrects;
    }

    public int getTotalQuestions() {
        return questionDataArrayList.size();
    }


    public boolean checkAnswer(String userAnswer) {
        boolean isTrue = getCurrentQuestion().getAnswer().equalsIgnoreCase(userAnswer);

        if (isTrue)
            totalCorrects++;
        else
            totalMistakes++;

        if (!isFinish()){
            position++;
        }
        return isTrue;
    }

    public void nextPosition(){
            position++;
        if(position==questionDataArrayList.size())
            position=0;
    }

    public boolean isFinish() {
        return position == questionDataArrayList.size();
    }

    public int getPosition() {
        return position+1;
    }






}
