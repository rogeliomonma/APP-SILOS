package com.example.paragon_automation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Crear_Usuarios extends AppCompatActivity {
Button btnC1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear__usuarios);
        btnC1= (Button) findViewById(R.id.btnGuardadarO);
        btnC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnC1 =new Intent(Crear_Usuarios.this,Main2Activity.class);
                startActivity(btnC1);
            }
        });
    }
}
