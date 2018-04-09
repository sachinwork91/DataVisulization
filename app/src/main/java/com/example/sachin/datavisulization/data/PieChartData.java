package com.example.sachin.datavisulization.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sachin on 2018-04-07.
 */


//This class provides the data to PieChart
public class PieChartData {


    static public List<String> listofCategory = new ArrayList<>();
    static public List<Integer> listofExpenditure = new ArrayList<>();


    public static List<String> getPCCategory() {
        listofCategory.add("Rent");
        listofCategory.add("Bus Pass");
        listofCategory.add("Grocery/Eating Out");
        listofCategory.add("Phone Bills");
        listofCategory.add("Others");


        return listofCategory;
    }


    public static List<Integer> getPCValues() {

        listofExpenditure.add(350);
        listofExpenditure.add(150);
        listofExpenditure.add(200);
        listofExpenditure.add(40);
        listofExpenditure.add(100);
        return listofExpenditure;
    }


}
