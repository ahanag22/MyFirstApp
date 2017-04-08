package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    public static final String MY_TAG = "the_custom_message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(MY_TAG,"onCreate");
    }
    public void sendMessage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

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


