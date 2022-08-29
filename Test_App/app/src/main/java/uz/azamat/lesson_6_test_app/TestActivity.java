package uz.azamat.lesson_6_test_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity {

    private int level_type;
    private String level;
    private TextView test_level, test1, test2, test3, test4, test5, test6, test7;
    private TextView test8, test9, test10, test11, test12, test13, test14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();
        level_type = bundle.getInt("level_type");


        if (level_type==1) {

            setContentView(R.layout.activity_test14);

            loadView14();

            loadDataViewElementary();

            loadActionElementary();
        }


        else if (level_type==2) {

            setContentView(R.layout.activity_test14);

            loadView14();

            loadDataViewPreIntermediate();

            loadActionPreIntermediate();
        }


        else if (level_type==3) {

            setContentView(R.layout.activity_test8);

            loadView8();

            loadDataViewIntermediate();

            loadActionIntermediate();
        }


        else if (level_type==4) {

            setContentView(R.layout.activity_test8);

            loadView8();

            loadDataViewElementary2();

            loadActionElem2();
        }

        else if (level_type==5) {

            setContentView(R.layout.activity_test8);

            loadView8();

            loadDataViewElementary2();

            loadActionInter2();
        }


    }


    //  Actions
    private void loadActionElementary() {

        test1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                level = "ElemTest1";

                Intent intent = new Intent(TestActivity.this, QuizActivity.class);

                Bundle bundle = new Bundle();

                bundle.putString("level", level);

                intent.putExtras(bundle);

                startActivity(intent);

            }
        });

        test2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                level = "ElemTest2";

                Intent intent = new Intent(TestActivity.this, QuizActivity.class);

                Bundle bundle = new Bundle();

                bundle.putString("level", level);

                intent.putExtras(bundle);

                startActivity(intent);

            }
        });

        test3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                level = "ElemTest3";

                Intent intent = new Intent(TestActivity.this, QuizActivity.class);

                Bundle bundle = new Bundle();

                bundle.putString("level", level);

                intent.putExtras(bundle);

                startActivity(intent);

            }
        });
    }

    private void loadActionPreIntermediate() {

        test1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                level = "PreInter1";

                Intent intent = new Intent(TestActivity.this, QuizActivity.class);

                Bundle bundle = new Bundle();

                bundle.putString("level", level);

                intent.putExtras(bundle);

                startActivity(intent);
            }
        });

        test2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                level = "PreInter2";

                Intent intent = new Intent(TestActivity.this, QuizActivity.class);

                Bundle bundle = new Bundle();

                bundle.putString("level", level);

                intent.putExtras(bundle);

                startActivity(intent);
            }
        });

        test3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                level = "PreInter3";

                Intent intent = new Intent(TestActivity.this, QuizActivity.class);

                Bundle bundle = new Bundle();

                bundle.putString("level", level);

                intent.putExtras(bundle);

                startActivity(intent);
            }
        });
    }

    private void loadActionIntermediate() {

        test1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                level = "Inter1";

                Intent intent = new Intent(TestActivity.this, QuizActivity.class);

                Bundle bundle = new Bundle();

                bundle.putString("level", level);

                intent.putExtras(bundle);

                startActivity(intent);
            }
        });

        test2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                level = "Inter2";

                Intent intent = new Intent(TestActivity.this, QuizActivity.class);

                Bundle bundle = new Bundle();

                bundle.putString("level", level);

                intent.putExtras(bundle);

                startActivity(intent);
            }
        });

        test3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                level = "Inter3";

                Intent intent = new Intent(TestActivity.this, QuizActivity.class);

                Bundle bundle = new Bundle();

                bundle.putString("level", level);

                intent.putExtras(bundle);

                startActivity(intent);
            }
        });
    }

    private void loadActionElem2() {
        test1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                level = "Elem2_1";

                Intent intent = new Intent(TestActivity.this, QuizActivity.class);

                Bundle bundle = new Bundle();

                bundle.putString("level", level);

                intent.putExtras(bundle);

                startActivity(intent);

            }
        });
    }

    private void loadActionInter2() {
        test1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                level = "Inter2_1";

                Intent intent = new Intent(TestActivity.this, QuizActivity.class);

                Bundle bundle = new Bundle();

                bundle.putString("level", level);

                intent.putExtras(bundle);

                startActivity(intent);

            }
        });
    }


    //  Data Views
    private void loadDataViewElementary() {
        test_level.setText("Level: Elementary");
        test1.setText("Verb to be - Possessive adjectives: my, your, his, her - Subject Pronouns - Plural nouns and Numbers");
        test2.setText("Verb to be: questions and negatives - Short answers - Prepositions - Possessive‘s - Opposite adjectives");
        test3.setText("Present Simple: Positive, Negative, Question - Verbs - Jobs - Personal pronouns and possessive adjectives");
    }

    private void loadDataViewPreIntermediate() {
        test_level.setText("Level: Pre - Intermediate");
        test1.setText("Present, Past, Future Tenses - Questions with Who, Why, How much - Phrases with more than one meaning");
        test2.setText("Present Simple, Present Continuous - Have/has got - But, and, however");
        test3.setText("Past Simple - Past Continuous - Irregular verbs - Linking words - Prepositions");
    }

    private void loadDataViewIntermediate() {
        test_level.setText("Level: Intermediate");
        test1.setText("Auxiliary verbs (do, be have) - Prepositions");
        test2.setText("Present Simple and Continuous - Present Passive - Prepositions");
        test3.setText(" While, during, for - Past Simple - Continuous - Perfect - Past Passive - Prepositions");
    }

    private void loadDataViewElementary2() {
        test_level.setText("Level: Elementary II\nPre-Intermediate II");
        test1.setText("Pronouns - Adverbs - Adjectives - Determiners");
    }


    //  Views
    private void loadView14() {
        test_level = findViewById(R.id.test_level);
        test1 = findViewById(R.id.test1);
        test2 = findViewById(R.id.test2);
        test3 = findViewById(R.id.test3);
        test4 = findViewById(R.id.test4);
        test5 = findViewById(R.id.test5);
        test6 = findViewById(R.id.test6);
        test7 = findViewById(R.id.test7);
        test8 = findViewById(R.id.test8);
        test9 = findViewById(R.id.test9);
        test10 = findViewById(R.id.test10);
        test11 = findViewById(R.id.test11);
        test12 = findViewById(R.id.test12);
        test13 = findViewById(R.id.test13);
        test14 = findViewById(R.id.test14);
    }

    private void loadView8() {
        test_level = findViewById(R.id.test_level);
        test1 = findViewById(R.id.test1);
        test2 = findViewById(R.id.test2);
        test3 = findViewById(R.id.test3);
        test4 = findViewById(R.id.test4);
        test5 = findViewById(R.id.test5);
        test6 = findViewById(R.id.test6);
        test7 = findViewById(R.id.test7);
        test8 = findViewById(R.id.test8);
    }
}