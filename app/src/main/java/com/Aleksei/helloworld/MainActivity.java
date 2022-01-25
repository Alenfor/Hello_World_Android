package com.Aleksei.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = ((TextView) findViewById(R.id.text));

// to change text color
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setTextColor(getResources().getColor(R.color.teal_700));
            }
        });
// to change background color
        findViewById(R.id.BackgroundColor).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // #e35259 red color
                findViewById(R.id.Background).setBackgroundColor(getResources().getColor(R.color.light_red));
            }
        });
//to change text
        findViewById(R.id.changeText).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Android is Awesome!");
            }
        });

//to reset everything
        findViewById(R.id.Background).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Hello from Aleksei!");

                textView.setTextColor(getResources().getColor(R.color.black));

                findViewById(R.id.Background).setBackgroundColor(getResources().getColor(R.color.cream));
            }
        });

        findViewById(R.id.changeCustomText).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userEnteredText = ((EditText) findViewById(R.id.editText)).getText().toString();
                if (userEnteredText.isEmpty()){
                    textView.setText("Enter your own text!");
                }
                else {
                    textView.setText(userEnteredText);
                }
            }
        });
    }
}