package uz.azamat.lesson_6_test_app.core;

import java.util.ArrayList;

public class QuestionData {

    private String question;

    private String answer;

    private ArrayList<String> variantArrays;

    public QuestionData(String question, String answer){
        this.question=question;
        this.answer=answer;
        variantArrays = new ArrayList<>();
    }

    public void addVariants(String variant){
        variantArrays.add(variant);
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public ArrayList<String> getVariantArrays() {
        return variantArrays;
    }




}
