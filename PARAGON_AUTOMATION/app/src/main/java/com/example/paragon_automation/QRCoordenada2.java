package com.example.paragon_automation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QRCoordenada2 extends AppCompatActivity {
    Button btnC1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q_r_coordendad2);

        btnC1= (Button)findViewById(R.id.btnC2);
        btnC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnC1 =new Intent(QRCoordenada2.this,QRCoordenada3.class);
                startActivity(btnC1);
            }
        });
    }
}
