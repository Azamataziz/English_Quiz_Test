package uz.azamat.lesson_6_test_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class LevelActivity2 extends AppCompatActivity {

    private ImageView prevPage;
    private Button articles, prepositions, pronouns, present_tenses, past_tenses;
    private String level;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_page3);

        loadView();

        prevPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LevelActivity2.this, LevelActivity.class);
                startActivity(intent);
            }
        });

        articles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                level = "Articles";

                Intent intent = new Intent(LevelActivity2.this, QuizActivity.class);

                Bundle bundle = new Bundle();

                bundle.putString("level", level);

                intent.putExtras(bundle);

                startActivity(intent);
            }
        });

        prepositions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                level = "Prepositions";

                Intent intent = new Intent(LevelActivity2.this, QuizActivity.class);

                Bundle bundle = new Bundle();

                bundle.putString("level", level);

                intent.putExtras(bundle);

                startActivity(intent);
            }
        });

        pronouns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                level = "Pronouns";

                Intent intent = new Intent(LevelActivity2.this, QuizActivity.class);

                Bundle bundle = new Bundle();

                bundle.putString("level", level);

                intent.putExtras(bundle);

                startActivity(intent);
            }
        });

        present_tenses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                level = "Present_tenses";

                Intent intent = new Intent(LevelActivity2.this, QuizActivity.class);

                Bundle bundle = new Bundle();

                bundle.putString("level", level);

                intent.putExtras(bundle);

                startActivity(intent);
            }
        });

        past_tenses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                level = "Past_tenses";

                Intent intent = new Intent(LevelActivity2.this, QuizActivity.class);

                Bundle bundle = new Bundle();

                bundle.putString("level", level);

                intent.putExtras(bundle);

                startActivity(intent);
            }
        });

    }

    private void loadAction() {

    }

    private void loadView() {
        prevPage = findViewById(R.id.prev_page1);
        articles = findViewById(R.id.articles);
        prepositions = findViewById(R.id.prepositions);
        pronouns = findViewById(R.id.pronouns);
        present_tenses = findViewById(R.id.present_tenses);
        past_tenses = findViewById(R.id.past_tenses);

    }
}