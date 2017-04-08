package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.TextView;


public class DisplayMessageActivity extends AppCompatActivity {
    public static final String MY_TAG = "the_custom_message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(message);
        Log.i(MY_TAG,"onCreate");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i(MY_TAG,"onStart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(MY_TAG,"onResume");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d(MY_TAG,"onPause");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d(MY_TAG,"onStop");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(MY_TAG,"onRestart");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(MY_TAG,"onDestroy");
    }
}
