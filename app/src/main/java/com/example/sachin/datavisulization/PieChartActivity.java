package com.example.sachin.datavisulization;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sachin.datavisulization.data.PieChartData;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.LinkedList;
import java.util.List;

import  com.example.sachin.datavisulization.data.PieChartData.*;

public class PieChartActivity extends AppBaseActivity {

    PieChart pieChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart);

        pieChart =(PieChart) findViewById(R.id.pieChart);
        pieChart.setUsePercentValues(true);
        pieChart.getDescription().setEnabled(false);

        pieChart.setExtraOffsets(5,10,5,5);
        pieChart.setDragDecelerationFrictionCoef(0.95f);


        pieChart.setDrawHoleEnabled(true);
        pieChart.setHoleColor(Color.WHITE);
        pieChart.setTransparentCircleRadius(61f);



        List<PieEntry> values = new LinkedList<>();

        //Populating Data in PieChart
        List<String> pcCategory =  PieChartData.getPCCategory();
        List<Integer> pcValues =  PieChartData.getPCValues();


        //Populating the Pie Chart Data
       for(int i=0; i<pcCategory.size() ; i++){
            values.add(new PieEntry(pcValues.get(i), pcCategory.get(i)));
        }




        //For Adding Animation
        pieChart.animateY(2000, Easing.EasingOption.EaseInOutCubic);

        //Adding Description
        Description description = new Description();
        description.setText("This is a Awesome Pie Chart");
        pieChart.setDescription(description);


        PieDataSet dataSet = new PieDataSet(values,"NAMESSSS");
        dataSet.setSliceSpace(3f);
        dataSet.setSelectionShift(5f);
        dataSet.setColors(ColorTemplate.MATERIAL_COLORS);


        PieData data = new PieData(dataSet);
        data.setValueTextSize(10f);
        data.setValueTextColor(Color.YELLOW);

        pieChart.setData(data);




    }
}
