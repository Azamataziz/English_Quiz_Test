package uz.azamat.lesson_6_test_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import uz.azamat.lesson_6_test_app.core.DataBase;

public class LastResultActivity extends AppCompatActivity {

    private TextView resultQuestion, resultTime, resultCorrect, resultMistake;
    private FrameLayout btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_result);

        DataBase.init(this);

        String time = DataBase.getDataBase().getTime();
        int question = DataBase.getDataBase().getTotalQuestion();
        int correct = DataBase.getDataBase().getLastCorrectResult();
        int mistake = DataBase.getDataBase().getLastMistakeResult();

        resultQuestion = findViewById(R.id.last_result_total);
        resultCorrect = findViewById(R.id.last_result_correct);
        resultMistake = findViewById(R.id.last_result_mistake);
        resultTime = findViewById(R.id.last_result_time);
        btnBack = findViewById(R.id.btnMenu);

        resultQuestion.setText(String.valueOf(question));
        resultCorrect.setText(String.valueOf(correct));
        resultMistake.setText(String.valueOf(mistake));
        resultTime.setText(time);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LastResultActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}

