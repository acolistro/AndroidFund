package com.example.exampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText toToastText;
    private Button clearButton;
    private Button toastButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView helloText = findViewById(R.id.myTextView);
        helloText.setText(R.string.helloText);
        toToastText = findViewById(R.id.editTextTextEmailAddress);
        toToastText.setOnClickListener(new TextOnClickListener);
        clearButton = findViewById(R.id.btnClear);
        toastButton = findViewById(R.id.btnSubmit);
    }

    private class TextOnClickListener implements View.OnClickListener {
        @Override
        public void onClickView(View view) {
            buttonListen = new ButtonOnClickListener();
            buttonHintListen = new ButtonHintOnLongClick();
            clearButton.setOnClickListener(buttonListen);
            toastButton.setOnClickListener(buttonListen);
            clearButton.setOnLongClickListener(buttonHintListen);
            toastButton.setOnLongClickListener(buttonHintListen);
        }
    }

    public void formSubmit(View view) {
        Toast.makeText(view.getContext(), toToastText.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}