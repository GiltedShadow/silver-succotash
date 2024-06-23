/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ceis420_finalp;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author never
 */
public class SalesPerson {
    private String name, title;
    private ArrayList<Double> sales = new ArrayList<>();
    
    public SalesPerson(String nm, String tt){
        this.name = nm;
        this.title = tt;
        //sales = sl;
        
    }
    
    public String getName(){
        return this.name;
    }
    public String getTitle(){
        return this.title;
    }
    public void addSales(double sale){
        this.sales.add(sale);
    }
    public ArrayList getSales(){
        return this.sales;
    }
    @Override
    public String toString(){
        String toPrint = this.getName() +" "+ this.getTitle()+ ": "+ this.getSales().toString();
        return toPrint;
    }

    /* 
    TODO ArrayList of sales people
    DONE ArrayList of sales - double
    TODO at least 3 people in sales with 3 different data points
    TODO when printing, should display min sales, max sales, and average sales for each employee and total for company
    */
        
    public Iterator<Double> iterSales(){
        return this.sales.iterator();
    }
    
    
}
