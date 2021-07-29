package com.example.paragon_automation;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;

import com.example.paragon_automation.ui.dashboard.DashboardFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import android.content.Intent;
public class Main2Activity extends AppCompatActivity {
    Button btnalta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        BottomNavigationView navView = findViewById(R.id.nav_view);



        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);


/*

        btnalta= (Button)findViewById(R.id.btnalta);
        btnalta.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent btnalta =new Intent(Main2Activity.this,altasilos.class);
                startActivity(btnalta);
            }
        });*/
    }




}
