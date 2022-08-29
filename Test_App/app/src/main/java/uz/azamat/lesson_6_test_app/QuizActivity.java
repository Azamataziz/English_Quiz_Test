package uz.azamat.lesson_6_test_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import uz.azamat.lesson_6_test_app.core.Datas.A1ElementaryData;
import uz.azamat.lesson_6_test_app.core.Datas.A2IntermediateData;
import uz.azamat.lesson_6_test_app.core.Datas.A1PreIntermediateData;
import uz.azamat.lesson_6_test_app.core.Datas.B1ElemPreInterData2;
import uz.azamat.lesson_6_test_app.core.Datas.B1InterUpperInterData;
import uz.azamat.lesson_6_test_app.core.Datas.B2Articles;
import uz.azamat.lesson_6_test_app.core.Datas.B2Prepositions;
import uz.azamat.lesson_6_test_app.core.Datas.B2Pronouns;
import uz.azamat.lesson_6_test_app.core.Datas.B3PastTenses;
import uz.azamat.lesson_6_test_app.core.Datas.B3PresentTenses;
import uz.azamat.lesson_6_test_app.core.GameController;


public class QuizActivity extends AppCompatActivity {

    public GameController gameController;

    private Button closeBtn, nextBtn;
    private TextView questionViewGreen, mistakeView, correctView, currentQuestionView, totalQuestionView;
    private RadioGroup answerGroup;
    private String answerText;
    private String level;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();
        level = bundle.getString("level");

        if (level.equals("ElemTest1")){
            gameController = new GameController(A1ElementaryData.makeTest1());
            gameController.startGame();
        }

        else if (level.equals("ElemTest2")) {
            gameController = new GameController(A1ElementaryData.makeTest2());
            gameController.startGame();
        }

        else if (level.equals("ElemTest3")){
            gameController = new GameController(A1ElementaryData.makeTest3());
            gameController.startGame();
        }

        else if (level.equals("PreInter1")){
            gameController = new GameController(A1PreIntermediateData.makeTest1());
            gameController.startGame();
        }

        else if (level.equals("PreInter2")){
            gameController = new GameController(A1PreIntermediateData.makeTest2());
            gameController.startGame();
        }

        else if (level.equals("PreInter3")){
            gameController = new GameController(A1PreIntermediateData.makeTest3());
            gameController.startGame();
        }

        else if (level.equals("Inter1")){
            gameController = new GameController(A2IntermediateData.makeTest1());
            gameController.startGame();
        }

        else if (level.equals("Inter2")){
            gameController = new GameController(A2IntermediateData.makeTest2());
            gameController.startGame();
        }

        else if (level.equals("Inter3")){
            gameController = new GameController(A2IntermediateData.makeTest3());
            gameController.startGame();
        }

        else if (level.equals("Elem2_1")){
            gameController = new GameController(B1ElemPreInterData2.makeTest1());
            gameController.startGame();
        }

        else if (level.equals("Inter2_1")){
            gameController = new GameController(B1InterUpperInterData.makeTest1());
            gameController.startGame();
        }

        else if (level.equals("Articles")) {
            gameController = new GameController(B2Articles.makeArticles());
            gameController.startGame();
        }

        else if (level.equals("Prepositions")) {
            gameController = new GameController(B2Prepositions.makeTest1());
            gameController.startGame();
        }

        else if (level.equals("Pronouns")) {
            gameController = new GameController(B2Pronouns.makeTest1());
            gameController.startGame();
        }

        else if (level.equals("Present_tenses")) {
            gameController = new GameController(B3PresentTenses.makeTest1());
            gameController.startGame();
        }

        else if (level.equals("Past_tenses")) {
            gameController = new GameController(B3PastTenses.makeTest1());
            gameController.startGame();
        }





        loadView();

        loadDataView();

        loadActions();


    }


    private void loadActions() {

        /*
        closeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startResult();
            }
        });


        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Bu yerda javob tekshiriladi

                if(gameController.isFinish()) {
                    // result activity ga o'tish:
                    startResult();
                    return;
                }

                if (answerText.isEmpty()){
                    Toast.makeText(QuizActivity.this,"Choose Answer", Toast.LENGTH_LONG).show();
                }
                else  {
                    boolean isFind = gameController.checkAnswer(answerText);

                    if (!gameController.isFinish()){
                        loadDataView();
                    }
                    else {
                        nextBtn.setText("Finish");
                    }
                }

            }
        });
        */


        for (int i = 0; i < answerGroup.getChildCount(); i++) {

            RadioButton answerButton = (RadioButton) answerGroup.getChildAt(i);

            answerButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    QuizActivity.this.answerText = answerButton.getText().toString();

                    if(gameController.isFinish()) {
                        startResult();
                        return;
                    }

                    if (answerText.isEmpty()){
                        Toast.makeText(QuizActivity.this,"Choose Answer", Toast.LENGTH_LONG).show();
                    }
                    else  {
                        boolean isFind = gameController.checkAnswer(answerText);

                        if (!gameController.isFinish()){
                            loadDataView();
                        }
                        else {
                            nextBtn.setText("Finish");
                        }
                    }

                }
            });
        }
    }


    private void loadDataView() {

        answerText = "";
        answerGroup.clearCheck();

        String totalQuestion = String.valueOf(gameController.getTotalQuestions());
        String currentQuestion = String.valueOf(gameController.getPosition());
        String question = String.valueOf(gameController.getQuestion());
        String correct = String.valueOf(gameController.getTotalCorrects());
        String mistake = String.valueOf(gameController.getTotalMistakes());

        ArrayList<String> variant = gameController.getVariant();

        for (int i = 0; i < variant.size(); i++) {
            System.out.println(variant.get(i));
        }

        currentQuestionView.setText(currentQuestion);
        questionViewGreen.setText(question);
        totalQuestionView.setText("/ "+totalQuestion);
        correctView.setText(correct);
        mistakeView.setText(mistake);

        for (int i = 0; i < answerGroup.getChildCount(); i++) {

            RadioButton answerButton1 =(RadioButton) answerGroup.getChildAt(i);

            if (i < variant.size()) {
                answerButton1.setText(variant.get(i));

            }
            else {
                answerButton1.setText(" ");
                answerButton1.setVisibility(View.GONE);
            }

        }
    }


    private void loadView() {
//        nextBtn = findViewById(R.id.next_btn);
//        closeBtn = findViewById(R.id.close_btn);
        questionViewGreen = findViewById(R.id.questions);
        correctView = findViewById(R.id.correct_answers);
        mistakeView = findViewById(R.id.mistake_answers);
        currentQuestionView = findViewById(R.id.current_question);
        totalQuestionView = findViewById(R.id.total_question);
        answerGroup = findViewById(R.id.answer_group1);
    }


    private void startResult(){

        gameController.endGame();

        Intent intent = new Intent(this, ResultActivity.class);

        Bundle bundle = new Bundle();

        bundle.putString("total_time", gameController.getTotalTime());
        bundle.putInt("total_question", gameController.getPosition()-1);
        bundle.putInt("total_correct", gameController.getTotalCorrects());
        bundle.putInt("total_mistake", gameController.getTotalMistakes());

        intent.putExtras(bundle);

        startActivity(intent);

        finish();

    }

}