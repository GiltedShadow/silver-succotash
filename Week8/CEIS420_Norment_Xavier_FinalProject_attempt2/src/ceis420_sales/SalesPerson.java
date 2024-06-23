/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ceis420_sales;

import java.util.ArrayList;

/**
 *
 * @author never
 */
public class SalesPerson {
    private static String name, title;
    private static ArrayList<Double> sales = new ArrayList<>();
    
    public SalesPerson(String nm, String tt, ArrayList sl){
        this.name = nm;
        this.title = tt;
        this.sales = sl;
        
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
}
