package com.example.sachin.datavisulization;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainActivity  extends AppBaseActivity {//extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    PieChart pieChart;

    private DrawerLayout mDrawerLayout ;
    private ActionBarDrawerToggle mToggle;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   //     mDrawerLayout = (DrawerLayout) findViewById(R.id.navDrawer);

   //     mToggle = new ActionBarDrawerToggle(MainActivity.this, mDrawerLayout, R.string.open, R.string.close);
//.addDrawerListener(mToggle);
     //   mToggle.syncState();
   //     getSupportActionBar().setDisplayHomeAsUpEnabled(true);

 //       NavigationView navigationView = (NavigationView) findViewById(R.id.navigationView);
//        navigationView.setNavigationItemSelectedListener(this);

    }


   /* public boolean onOptionsItemSelected(MenuItem item){

        if(mToggle.onOptionsItemSelected(item)){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/


   /* @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Toast.makeText(this, "RADAR dsadsada" , Toast.LENGTH_SHORT).show();
        int id= item.getItemId();

        if(id == R.id.showPieChart){

            Toast.makeText(this, "PIE CHART" , Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, PieChartActivity.class);
            startActivity(intent);

        }else{
            Toast.makeText(this, "RADAR CHART" , Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, RadarChartActivity.class);
            startActivity(intent);


        }
        return false;
    }*/
}
