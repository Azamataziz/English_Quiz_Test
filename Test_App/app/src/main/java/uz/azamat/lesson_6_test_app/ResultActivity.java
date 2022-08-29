package uz.azamat.lesson_6_test_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import uz.azamat.lesson_6_test_app.core.DataBase;

public class ResultActivity extends AppCompatActivity {

    private TextView timeView, totalQuestionView, correctView, mistakeView;
    private String timeTxt;
    private CardView refresh;
    private int totalQuestionTxt, correctTxt, mistakeTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            DataBase.init(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();

        timeTxt = bundle.getString("total_time");
        totalQuestionTxt = bundle.getInt("total_question");
        correctTxt = bundle.getInt("total_correct");
        mistakeTxt = bundle.getInt("total_mistake");

        loadView();
        loadDataView();

        refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ResultActivity.this, MainActivity.class);
                startActivity(intent1);
                finish();
            }
        });

        String time = timeTxt;
        int resultTotalCorrect = correctTxt;
        int resultTotalMistake = mistakeTxt;
        int resultQuestion = totalQuestionTxt;


        DataBase.getDataBase().saveLastCorrectResult(resultTotalCorrect);
        DataBase.getDataBase().saveLastMistakeResult(resultTotalMistake);
        DataBase.getDataBase().saveTime(time);
        DataBase.getDataBase().saveTotalQuestion(resultQuestion);
    }

    private void loadDataView() {

        timeView.setText(timeTxt);
        totalQuestionView.setText(String.valueOf(totalQuestionTxt));
        correctView.setText(String.valueOf(correctTxt));
        mistakeView.setText(String.valueOf(mistakeTxt));
    }

    private void loadView() {
        timeView = findViewById(R.id.result_time);
        totalQuestionView = findViewById(R.id.result_result_total);
        correctView = findViewById(R.id.result_correct);
        mistakeView = findViewById(R.id.result_mistake);
        refresh = findViewById(R.id.refresh);
    }
}