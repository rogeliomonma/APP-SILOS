package com.example.paragon_automation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class QRCoordenada1 extends AppCompatActivity {
    Button btnC1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q_r_codenada1);


        btnC1= ( Button)findViewById(R.id.btnC1);
        btnC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnC1 =new Intent(QRCoordenada1.this,QRCoordenada2.class);
                startActivity(btnC1);
            }
        });
    }
}
