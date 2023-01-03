package com.example.multiplicationtable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private Button button;
    private TextView textView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer buffer = new StringBuffer();

//                Toast.makeText(MainActivity.this, "Thanks for Using the app!", Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();
                int a = Integer.parseInt(s);
                for (int i = 1; i < 11; i++) {
                    int b = a * i;
                    buffer.append(a + " * "+ i +" = "+ b +"\n");
                }
                textView.setText(buffer);
            }
        });
    }}
