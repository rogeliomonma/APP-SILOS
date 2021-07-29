package com.example.paragon_automation.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.paragon_automation.Enviar;
import com.example.paragon_automation.EscanerQR;
import com.example.paragon_automation.R;
import com.example.paragon_automation.REPORTES;
import com.example.paragon_automation.SILOS;
import com.example.paragon_automation.USUARIOS;
//import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DashboardFragment extends Fragment {
    Button btnalta;
    Button btnescaner;
    Button usuarios;
    Button reportes;
    Button web;
    View vista;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        vista=inflater.inflate(R.layout.fragment_dashboard,container,false);


        btnalta= (Button) vista.findViewById(R.id.btnalta);
        btnescaner= (Button) vista.findViewById(R.id.btnescaner);
        usuarios= (Button) vista.findViewById(R.id.btnusuario);
        reportes= (Button) vista.findViewById(R.id.btnreportes);
        web= (Button) vista.findViewById(R.id.btnenviar);
        btnalta.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
              Intent btnalta =new Intent(getActivity(), SILOS.class);
              startActivity(btnalta);
              Toast.makeText(getContext(),"Alta de Silos",Toast.LENGTH_LONG).show();


            }
        });

        btnescaner.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent btnescaner =new Intent(getActivity(), EscanerQR.class);
                startActivity(btnescaner);
                Toast.makeText(getContext(),"Escaner de datos",Toast.LENGTH_LONG).show();
            }
        });

        usuarios.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent usuarios =new Intent(getActivity(), USUARIOS.class);
                startActivity(usuarios);
                Toast.makeText(getContext(),"Usuarios",Toast.LENGTH_LONG).show();
            }
        });
       reportes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent reportes =new Intent(getActivity(), REPORTES.class);
                startActivity(reportes);
                Toast.makeText(getContext(),"Usuarios",Toast.LENGTH_LONG).show();
            }
        });
        web.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent web =new Intent(getActivity(), Enviar.class);
                startActivity(web);
                Toast.makeText(getContext(),"Usuarios",Toast.LENGTH_LONG).show();
            }
        });
        return vista;
    }
}


// private DashboardViewModel dashboardViewModel;
//private DashboardViewModel dashboardViewModel2;

     /*
     dashboardViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel.class);*/
//  View root = inflater.inflate(R.layout.fragment_dashboard, container, false);

     /*
        final TextView textView = root.findViewById(R.id.text_dashboard);
        final TextView textView2 = root.findViewById(R.id.text_dashboard2);
        final TextView textView3 = root.findViewById(R.id.text_dashboard3);
        final TextView textView4 = root.findViewById(R.id.text_dashboard4);
        final TextView textView5 = root.findViewById(R.id.text_dashboard5);
        final TextView textView6 = root.findViewById(R.id.text_dashboard6);
*/