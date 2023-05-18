package sg.edu.rp.c346.id22011199.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity1 extends AppCompatActivity {

    TextView tvAns1;
    TextView tvAns2;
    TextView tvAns3;
    TextView tvAns4;
    TextView tvAns5;
    TextView tvAns6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);

        tvAns1 = findViewById(R.id.textView1);
        tvAns2 = findViewById(R.id.textView2);
        tvAns3 = findViewById(R.id.textView3);
        tvAns4 = findViewById(R.id.textView4);
        tvAns5 = findViewById(R.id.textView5);
        tvAns6 = findViewById(R.id.textView6);


        Intent intent = getIntent();

        String modCode = intent.getStringExtra("Module Code");
        String modName = intent.getStringExtra("Module Name");
        String acadYear = intent.getStringExtra("Academic Year");
        String sem = intent.getStringExtra("Semester");
        String modCred = intent.getStringExtra("Module Credit");
        String ven = intent.getStringExtra("Venue");


        tvAns1.setText(modCode);
        tvAns2.setText(modName);
        tvAns3.setText(acadYear);
        tvAns4.setText(sem);
        tvAns5.setText(modCred);
        tvAns6.setText(ven);











    }
}