package com.example.paragon_automation;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class BAJASILOS extends AppCompatActivity implements ZXingScannerView.ResultHandler {
Button btnC1;
    private ZXingScannerView escaner1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bajasilos);
        btnC1= (Button) findViewById(R.id.GuardarNuevoSilo);
        btnC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnC1 =new Intent(BAJASILOS.this,Main2Activity.class);
                startActivity(btnC1);
            }
        });
    }
    public void scanersilonuevo(View v){
        escaner1=new ZXingScannerView(this);
        setContentView(escaner1);
        escaner1.setResultHandler(this);
        escaner1.startCamera();
    }
    @Override
    public void handleResult(Result result ){


        Log.v("HandleResult",result.getText());
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("EL VALOR");
        builder.setMessage(result.getText());
        AlertDialog alertDialog =builder.create();
        alertDialog.show();




    }
}
