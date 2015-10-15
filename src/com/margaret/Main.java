package com.margaret;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Coffee Shop Sales Calculator Program");

        double totalSales = 0;

        Coffee hotc = new Coffee("hot chocolate");
        Coffee tea = new Coffee("tea");
        Coffee cap = new Coffee("cappucino");

        ArrayList<Coffee> coffees = new ArrayList<>(Arrays.asList(hotc, tea, cap));

// for each type of drink find out how many were sold, what the price was, and accumulate the total sales for the day

        for (Coffee drink : coffees){
            drink.setDaySales(scanner);
            drink.setPrice(scanner);
            totalSales += drink.salesCalc();
        }

// output results
        System.out.format("Total sales for the day are $%.2f", totalSales);
    }
} // end class main
