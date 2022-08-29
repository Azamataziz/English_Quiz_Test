package uz.azamat.lesson_6_test_app;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnStart, bntAbout, bntExit, btnResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        btnStart = findViewById(R.id.btn_start);
        btnResult = findViewById(R.id.btn_result);
        bntAbout = findViewById(R.id.btn_about);
        bntExit = findViewById(R.id.btn_exit);



        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, LevelActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnStart.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(MainActivity.this, "YES", Toast.LENGTH_LONG).show();
                return false;
            }
        });

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, LastResultActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}