package com.example.paragon_automation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class USUARIOS extends AppCompatActivity {
ImageButton NuevoUsuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuarios);
        NuevoUsuario=(ImageButton)findViewById(R.id.NuevoUsuario) ;
        NuevoUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnC1 =new Intent(USUARIOS.this, Crear_Usuarios.class);
                startActivity(btnC1);
            }
        });
    }
}