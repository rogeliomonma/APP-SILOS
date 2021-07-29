package com.example.paragon_automation;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;
public class EscanerQR extends AppCompatActivity implements ZXingScannerView.ResultHandler {
Button btnC1;
EditText EditTexto;
private ZXingScannerView escaner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escaner_q_r);
        btnC1= (Button) findViewById(R.id.btnSiguineteqr);
        EditTexto = (EditText) findViewById(R.id.numO3);
        btnC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnC1 =new Intent(EscanerQR.this,QRCoordenada1.class);
                startActivity(btnC1);
            }
        });


    }
    public void btnqr(View v){
        escaner=new ZXingScannerView(this);
        setContentView(escaner);
        escaner.setResultHandler(this);
        escaner.startCamera();
    }
    @Override
    public void handleResult(Result result ){


        Log.v("HandleResult",result.getText());
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("EL VALOR");
        builder.setMessage(result.getText());
        AlertDialog alertDialog =builder.create();
        alertDialog.show();
        Bundle parametros=this.getIntent().getExtras();
      //  String datos=parametros.getString(result.getText());
       // EditTexto.setText(datos);
       // Intent i=new Intent(this,EscanerQR.class);
       // startActivity(i);


      

    }

}
