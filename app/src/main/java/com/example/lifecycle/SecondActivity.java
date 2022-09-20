package com.example.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    Button btn_third, btn_first;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        Toast.makeText(this, "Creating the Second screen", Toast.LENGTH_SHORT).show();
        btn_third =  findViewById(R.id.btn_second_third);
        btn_first =  findViewById(R.id.btn_second_first);
    }


    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Resuming Second Screen", Toast.LENGTH_SHORT).show();
        btn_third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(SecondActivity.this, ThirdScreen.class);
                startActivity(i);
            }
        });
        btn_first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(SecondActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Destroying Second Screen", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Restarting Second Screen", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Destroying Second Screen", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Pausing Second Screen", Toast.LENGTH_SHORT).show();
    }
}
