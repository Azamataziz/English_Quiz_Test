package uz.azamat.lesson_6_test_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import uz.azamat.lesson_6_test_app.core.Datas.A1ElementaryData;
import uz.azamat.lesson_6_test_app.core.GameController;

public class LevelActivity extends AppCompatActivity {

    private TextView elementary1, preInter1, inter1, elem2, inter2;
    private ImageView nextPage, prevPage;
    private int level;

    public GameController gameController, gameController1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_page1);

        gameController = new GameController(A1ElementaryData.makeTest1());
//        gameController1 = new GameController(A1ElementaryData.makeModalData());

        elementary1 = findViewById(R.id.elementary1);
        preInter1 = findViewById(R.id.pre_inter_1);
        inter1 = findViewById(R.id.inter_1);
        elem2 = findViewById(R.id.elementary2);
        inter2 = findViewById(R.id.upper_inter1);
        nextPage = findViewById(R.id.next_page);
        prevPage = findViewById(R.id.prev_page1);

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LevelActivity.this, LevelActivity2.class);
                startActivity(intent);
            }
        });




        chooseLevel();

    }

    public void chooseLevel() {

        //  Level - 1
        elementary1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                level = 1;

                Intent intent = new Intent(LevelActivity.this, TestActivity.class);

                Bundle bundle = new Bundle();

                bundle.putInt("level_type", level);

                intent.putExtras(bundle);

                startActivity(intent);

            }
        });

        //  Level - 2
        preInter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                level = 2;
                Intent intent = new Intent(LevelActivity.this, TestActivity.class);

                Bundle bundle = new Bundle();

                bundle.putInt("level_type", level);

                intent.putExtras(bundle);

                startActivity(intent);

            }
        });

        //  Level - 3
        inter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                level = 3;

                Intent intent = new Intent(LevelActivity.this, TestActivity.class);

                Bundle bundle = new Bundle();

                bundle.putInt("level_type", level);

                intent.putExtras(bundle);

                startActivity(intent);

            }
        });

        //  Level - 4
        elem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                level = 4;

                Intent intent = new Intent(LevelActivity.this, TestActivity.class);

                Bundle bundle = new Bundle();

                bundle.putInt("level_type", level);

                intent.putExtras(bundle);

                startActivity(intent);

            }
        });

        //  Level - 5
        inter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                level = 5;

                Intent intent = new Intent(LevelActivity.this, TestActivity.class);

                Bundle bundle = new Bundle();

                bundle.putInt("level_type", level);

                intent.putExtras(bundle);

                startActivity(intent);

            }
        });




    }
}