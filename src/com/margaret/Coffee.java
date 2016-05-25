package com.margaret;

import java.util.*;

public class Coffee {

    // data attributes
    private String bev;
    private Integer daySales;
    private Double price;

    // constructor called using date from the input file "coffee.txt"
    public Coffee(String bev) {
        this.bev = bev;
        this.daySales = 0;  // set daySales and price to 0 because the only a beverage name is used to create a Coffee
        this.price = 0.00;
    }

    // getters
    public String getBev() {
        return bev;
    }
    public Integer getDaySales() {
        return daySales;
    }
    public Double getPrice() {
        return price;
    }

    // setters
    public void setBev(String bev) {
        this.bev = bev;
    }

    // this method name is altered from the original coffee shop program, it takes in a Scanner from main
    // gets and tests user input for the number of a particular drink sold in a day and puts the information
    // in that drink's salesToday var

    public void setDaySales (Scanner x) {  // I decided to use the set name because that's essentially what it does, same with the setPrice method

        boolean working = false;
        String dayStr;
        while (!working) {
            // get a legal integer that is greater than 0 for sales of a given drink
            try {
                System.out.println("How many cups of " + this.bev + " did you sell today?");
                dayStr = x.nextLine();
                this.daySales = Integer.parseInt(dayStr);
                if (this.daySales >= 0) { // the sales for the day can be 0
                    working = true;
                } else {
                    System.out.println("Please enter a number greater than or equal to 0.");
                }
            } catch (Exception badInt) {
                System.out.println("You didn't enter a valid number for " + this.bev + " sold. Please enter a whole, non-decimal number greater than 0.");
            }
        }
    } // end numVal fn

    // this method name is very similar to cupsInput, it takes in a Scanner from main
    // gets and tests user input for the price of a particular drink sold in a day and 
    // puts the information in that drink's price var

    public void setPrice (Scanner x) {

        boolean working = false;
        String prStr;
        while (!working) {
            try {
                System.out.println("What does a cup of " + this.bev + " cost?");
                prStr = x.nextLine();
                this.price = Double.parseDouble(prStr);
                if (this.price >= 0) { // the price can be 0
                    working = true;
                } else { // the price can be 0
                    System.out.println("Please enter a number greater than or equal to 0.");
                }
            } catch (Exception badDouble) {
                System.out.println("You didn't enter a valid price for " + this.bev + ". Please enter a whole or decimal number.");
            }
        }
    }

// this method is so much simpler now, and it is hidden from main which is nice

    public double salesCalc() {
        double drinkSales = this.price * this.daySales;
        return drinkSales;
    }
}

