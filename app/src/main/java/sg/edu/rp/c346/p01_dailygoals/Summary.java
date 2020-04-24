package sg.edu.rp.c346.p01_dailygoals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Summary extends AppCompatActivity {

    TextView tv1,tv2,tv3,tv4;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        btnBack = findViewById(R.id.btnBack);

        Intent intent = getIntent();
        String [] summary = intent.getStringArrayExtra("summary");
        tv1.setText("Read up on material before class: " + summary[0]);
        tv2.setText("Arrive on time so as not to miss important part of lesson: " + summary[1]);
        tv3.setText("Attempt the problem myself: " + summary[2]);
        tv4.setText("Reflection: " + summary[3]);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Summary.this,MainActivity.class));
            }
        });
    }
}
