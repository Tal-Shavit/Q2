package com.example.q2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

public class MainActivity extends AppCompatActivity {

    private EditText main_TXT_name;
    private EditText main_TXT_salary;
    private MaterialButton main_BTN_OK;
    private MaterialTextView main_TXT_inputName;
    private MaterialTextView main_TXT_inputSalary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_TXT_name = findViewById(R.id.main_TXT_name);
        main_TXT_salary = findViewById(R.id.main_TXT_salary);
        main_BTN_OK = findViewById(R.id.main_BTN_OK);
        main_TXT_inputName = findViewById(R.id.main_TXT_inputName);
        main_TXT_inputSalary = findViewById(R.id.main_TXT_inputSalary);


        main_BTN_OK.setOnClickListener(view -> {input1();});

    }

    private void input1()
    {
        main_TXT_inputName.setText("Your name is: " + main_TXT_name.getText().toString() + "\n");
        main_TXT_inputSalary.setText("Your salary is: " + main_TXT_salary.getText().toString() + "\n");
    }
}