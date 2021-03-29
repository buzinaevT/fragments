package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    Button button3;
    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=(Button) findViewById(R.id.button1);
        button2=(Button) findViewById(R.id.button2);
        button3=(Button) findViewById(R.id.button3);
        textView = (TextView) findViewById(R.id.textView);
        imageView = (ImageView) findViewById(R.id.imageView);

        button1.setOnClickListener(this::onClick);
        button2.setOnClickListener(this::onClick);
        button3.setOnClickListener(this::onClick);

    }

    private void onClick(View view) {

        switch (view.getId()) {
            case R.id.button1:
                textView.setText("Банан");
                imageView.setImageResource(R.drawable.banana);
                break;
            case R.id.button2:

                textView.setText("Пицца");
                imageView.setImageResource(R.drawable.pizza);
                break;

            case R.id.button3:
                textView.setText("Яблоко");
                imageView.setImageResource(R.drawable.apple);
                break;
        }
    }


}