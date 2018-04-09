package com.example.sachin.datavisulization;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.sachin.datavisulization.data.BarChartData;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.github.mikephil.charting.utils.ViewPortHandler;

import java.util.ArrayList;
import java.util.List;

public class BarChartActivity extends AppBaseActivity {


    BarChart barChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart);


        barChart = (BarChart) findViewById(R.id.simplebarchart);

        barChart.setDrawBarShadow(false);
        barChart.setDrawValueAboveBar(true);
        barChart.setMaxVisibleValueCount(50);
        barChart.setPinchZoom(false);
        barChart.setDrawGridBackground(true);

        ArrayList<BarEntry> barEntries = new ArrayList<>();


        final List<String> barCategory= BarChartData.getBarCategory() ;
        List<Float> barExpenditure = BarChartData.getBarValues() ;


        for( int i=0; i<barCategory.size() ; i++ ){
            barEntries.add(new BarEntry(  i ,barExpenditure.get(i) )) ;
       }

        BarDataSet barDataSet = new BarDataSet(barEntries, " Monthly Expenditure ");
        barDataSet.setColors(ColorTemplate.COLORFUL_COLORS);

        BarData data = new BarData(barDataSet );

        data.setBarWidth(0.9f);

        barChart.setData(data);
        XAxis xAxis = barChart.getXAxis();
        barChart.getData().setValueTextSize(15);

           xAxis.setValueFormatter(new IAxisValueFormatter() {
             @Override
            public String getFormattedValue(float value, AxisBase axis) {
             return barCategory.get((int) value);
           }
          });

        barChart.animateY(2000, Easing.EasingOption.EaseInOutCubic);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);

         xAxis.setAxisMinimum(1);
        xAxis.setCenterAxisLabels(true);
    }


    public class MyXAxisValueFormatter implements IAxisValueFormatter {

        private String[] mValues;
        public MyXAxisValueFormatter(String[] values){
          this.mValues= values;
        }

        @Override
        public String getFormattedValue(float value, AxisBase axis){
             return mValues[(int)value];
        }

     }



}
