package com.example.paragon_automation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class finescaner extends AppCompatActivity {
Button btnC1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finescaner);
        btnC1= (Button) findViewById(R.id.Terminar);
        btnC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnC1 =new Intent(finescaner.this,Main2Activity.class);
                startActivity(btnC1);
            }
        });


    }
}
