package sg.edu.rp.c346.id22011199.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvC346;
    TextView tvC206;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvC346 = findViewById(R.id.textViewC346);
        tvC206 = findViewById(R.id.textViewC206);



        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, AnswerActivity1.class);


                intent.putExtra("Module Code", "Module Code: C346");
                intent.putExtra("Module Name", "Module Name: Android Programming");
                intent.putExtra("Academic Year", "Academic Year: 2023");
                intent.putExtra("Semester", "Semester: 1");
                intent.putExtra("Module Credit", "Module Credit: 4");
                intent.putExtra("Venue", "Venue: W65D");

                startActivity(intent);



            }
        });

        tvC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, AnswerActivity1.class);

                intent.putExtra("Module Code", "Module Code: C206");
                intent.putExtra("Module Name", "Module Name: Software Development Process");
                intent.putExtra("Academic Year", "Academic Year: 2023");
                intent.putExtra("Semester", "Module Semester: 1");
                intent.putExtra("Module Credit", "Module Credit: 4");
                intent.putExtra("Venue", "Venue: W65D");

                startActivity(intent);


            }
        });






    }
}