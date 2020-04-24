package sg.edu.rp.c346.p01_dailygoals;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.IntentCompat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;

import java.util.Map;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg1,rg2,rg3;
    EditText etReflection;
    Button btnOK;
    RadioButton rb1,rb2,rb3;
    int selectedButtonId1,selectedButtonId2,selectedButtonId3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg1 = findViewById(R.id.rg2);
        rg2 = findViewById(R.id.rg2);
        rg3 = findViewById(R.id.rg3);
        etReflection = findViewById(R.id.etReflection);
        btnOK = findViewById(R.id.btnOk);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String reflection = etReflection.getText().toString();
                selectedButtonId1 = rg1.getCheckedRadioButtonId();
                selectedButtonId2 = rg2.getCheckedRadioButtonId();
                selectedButtonId3 = rg3.getCheckedRadioButtonId();

                rb1 = findViewById(selectedButtonId1);
                rb2 = findViewById(selectedButtonId2);
                rb3 = findViewById(selectedButtonId3);



                String[] summary = {rb1.getText().toString(),rb2.getText().toString(),rb3.getText().toString(),reflection};

                Intent intent = new Intent(MainActivity.this,Summary.class);
                intent.putExtra("summary",summary);
                startActivity(intent);


            }
        });

    }

}
