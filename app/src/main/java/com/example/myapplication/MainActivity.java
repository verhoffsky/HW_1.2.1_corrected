package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName;
    private EditText editTextMail;
    private TextView successfulSubscribe;
    private Button okButton;
    private Button deleteButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editText_name);
        editTextMail = findViewById(R.id.editText_mail);
        successfulSubscribe = findViewById(R.id.text_successful_subscribe);

        findViewById(R.id.button_ok).setOnClickListener(okClickListener);
        findViewById(R.id.button_delete).setOnClickListener(deleteClickListener);

    }

    private View.OnClickListener okClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String name = String.valueOf(editTextName.getText());
            String mail = String.valueOf(editTextMail.getText());

            String message = getString(R.string.message_template, name, mail);
            successfulSubscribe.setText(message);
        }
    };

    private View.OnClickListener deleteClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            editTextName.setText(null);
            editTextMail.setText(null);
            successfulSubscribe.setText(null);
            }
    };
}