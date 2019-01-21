package com.example.deeplinkingdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();

        if(intent!=null && intent.getData() !=null){
            ((TextView)findViewById(R.id.tv1)).setText(intent.getData().toString());

        }
    }
}
