package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
public TextView tv_title;
public Button btn_second, btn_third;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "I am created", Toast.LENGTH_SHORT).show();
        setContentView(R.layout.activity_main);
        //initializing the controls
        tv_title = findViewById(R.id.txt_welcome);
        btn_second= findViewById(R.id.btn_main_second);
        btn_third= findViewById(R.id.btn_main_third);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "I am starting screen1", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //Toast.makeText(this, "I am resuming", Toast.LENGTH_SHORT).show();
        btn_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //tv_title.setText("Welcome");
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(i);
            }
        });
        btn_third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ThirdScreen.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "I am restarting screen1", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "I am pausing screen1", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "I am stopping screen1", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "I am being destroyed screen1", Toast.LENGTH_SHORT).show();


    }
}