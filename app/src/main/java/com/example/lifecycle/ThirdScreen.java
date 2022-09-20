package com.example.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdScreen extends AppCompatActivity {
    protected Button btn_main, btn_second;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_activity);
        btn_main = findViewById(R.id.btn_third_main);
        btn_second = findViewById(R.id.btn_third_prev);
        //Toast.makeText(this, "Creating Third screen", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Resuming Third Screen", Toast.LENGTH_SHORT).show();
        btn_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ThirdScreen.this, MainActivity.class ));
            }
        });
        btn_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ThirdScreen.this, SecondActivity.class ));
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Destroying Third Screen", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Restarting Third Screen", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Destroying Third Screen", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Pausing Third Screen", Toast.LENGTH_SHORT).show();
    }
}
