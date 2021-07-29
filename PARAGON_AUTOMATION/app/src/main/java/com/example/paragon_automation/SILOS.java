package com.example.paragon_automation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class SILOS extends AppCompatActivity  {
    ImageButton btnagregarsilo;
    ImageButton btneliminarsilo;
    ImageButton btnModificarsilo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silos);
        btnagregarsilo=(ImageButton)findViewById(R.id.btnagregarsilo);
        btneliminarsilo=(ImageButton)findViewById(R.id.btneliminarsilo);
        btnModificarsilo=(ImageButton)findViewById(R.id.btnModificarsilo);
        btnagregarsilo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnC1 =new Intent(SILOS.this, ALTASILOS.class);
                startActivity(btnC1);
            }
        });
        btnModificarsilo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent C =new Intent(SILOS.this, MODIFICARDSILO.class);
                startActivity(C);
            }
        });
        btneliminarsilo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent C =new Intent(SILOS.this, BAJASILOS.class);
                startActivity(C);
            }
        });

    }

}