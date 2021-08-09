package com.gunder.decimaltobinary;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText input, output;
    Button submit, reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = (EditText) findViewById(R.id.editText);
        output = (EditText) findViewById(R.id.output);
        submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(v -> {
            String string = input.getText().toString();
            int i = Integer.parseInt(string);
            String binary = Integer.toBinaryString(i);
            output.setText(binary);
        });
        reset = (Button) findViewById(R.id.reset);
        reset.setOnClickListener(v -> {
            input.setText("");
            output.setText("");
        });

    }
}
