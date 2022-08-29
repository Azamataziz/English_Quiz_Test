package uz.azamat.lesson_6_test_app.core;

import android.content.Context;
import android.content.SharedPreferences;

public class DataBase {

    private static DataBase dataBase = null;
    private final SharedPreferences preferences;
    private SharedPreferences.Editor editor;

    private DataBase(Context context) {
        preferences = context.getSharedPreferences("last_result", Context.MODE_PRIVATE);
    }

    public static void init(Context context) {
        if (dataBase==null) {
            dataBase = new DataBase(context);
        }
    }

    public static DataBase getDataBase() {
        return dataBase;
    }

    public void saveLastCorrectResult(int correct) {
        editor = preferences.edit();
        editor.putInt("correct", correct);
        editor.apply();
    }

    public int getLastCorrectResult() {
        int correct = preferences.getInt("correct", 0);
        return correct;
    }

    public void saveLastMistakeResult(int mistake) {
        editor = preferences.edit();
        editor.putInt("mistake", mistake);
        editor.apply();
    }

    public int getLastMistakeResult() {
        int mistake = preferences.getInt("mistake", 0);
        return mistake;
    }


    public void saveTotalQuestion(int totalQuestion) {
        editor = preferences.edit();
        editor.putInt("total_question", totalQuestion);
        editor.apply();
    }

    public int getTotalQuestion() {
        int totalQuestion = preferences.getInt("total_question", 0);
        return totalQuestion;
    }



    public void saveTime(String time) {
        editor = preferences.edit();
        editor.putString("time", time);
        editor.apply();
    }
    public String getTime() {
        String time = preferences.getString("time", "00:00:00");
        return time;
    }

}
