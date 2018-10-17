package com.example.taruc.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TextView textViewMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //onCreate = main function
        super.onCreate(savedInstanceState);
        //Show me the UI
        //R = resource
        //layout = folder
        setContentView(R.layout.activity_main);

        textViewMessage = findViewById(R.id.Greetings);
    }

    public void showMessages (View View){
        textViewMessage.setText("Hello Lolicon");
    }
}
