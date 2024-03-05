package com.mirea.makhankodv.buttonclicker;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView textViewStudent;
    private Button btnWhoAmI;
    private Button btnItIsNotMe;
    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewStudent = findViewById(R.id.textViewStudent);
        btnWhoAmI = findViewById(R.id.btnWhoAmI);
        btnItIsNotMe = findViewById(R.id.btnItIsNotMe);
        checkBox = findViewById(R.id.checkBox);

        View.OnClickListener oclBtnWhoAmI = new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                checkBox.setChecked(!checkBox.isChecked());
                textViewStudent.setText("Мой номер по списку 18");
            }
        };

        btnWhoAmI.setOnClickListener(oclBtnWhoAmI);
    }

    public void onItIsNotMeButtonClick(View view) {
        checkBox.setChecked(!checkBox.isChecked());
        textViewStudent.setText("Это не я сделал");
        Toast.makeText(this, "Еще один способ!", Toast.LENGTH_SHORT).show();
    }
}
