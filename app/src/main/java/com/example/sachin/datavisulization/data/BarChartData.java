package com.example.sachin.datavisulization.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sachin on 2018-04-07.
 */

public class BarChartData {

    static  List<String> listofCategory = new ArrayList<>();
    static  List<Float> listofExpenditure = new ArrayList<>();


    public static List<String> getBarCategory() {
        listofCategory.add("Rent ");
        listofCategory.add("Bus Pass");
        listofCategory.add("Grocery/Eating Out");
        listofCategory.add("Phone Bills");
        listofCategory.add("Others");


        return listofCategory;
    }


    public static List<Float> getBarValues() {

        listofExpenditure.add(35f);
        listofExpenditure.add(15f);
        listofExpenditure.add(20f);
        listofExpenditure.add(40f);
        listofExpenditure.add(10f);
        return listofExpenditure;
    }
}
