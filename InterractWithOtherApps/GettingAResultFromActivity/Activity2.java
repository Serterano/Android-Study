package me.erano.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;

public class Activity2 extends AppCompatActivity {

    private int number1;
    private int number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        setTitle("Activity 2");

        Intent intent = getIntent();

        number1 = intent.getIntExtra("number1",0);
        number2 = intent.getIntExtra("number2",0);

        TextView textViewNumbers =findViewById(R.id.text_view_numbers);
        textViewNumbers.setText("Numbers: "+number1+" ,"+number2);

        Button buttonAdd = findViewById(R.id.button_add);
        Button buttonSubstract = findViewById(R.id.button_substract);

    }

    public void add(View view){
        int result = number1 + number2;
        Intent resultIntent =  new Intent();
        resultIntent.putExtra("result",result);

        setResult(RESULT_OK,resultIntent);
        finish();
    }
    public void substract(View view){
        int result = number1 - number2;
        Intent resultIntent =  new Intent();
        resultIntent.putExtra("result",result);

        setResult(RESULT_OK,resultIntent);
        finish();
    }
}