package ceis420_sales;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author never
 */
public class SalesTracking {
    public static ArrayList salesPersons = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Double> salesToAdd = new ArrayList<>();
        SalesPerson[] person = new SalesPerson[3];
        person[0] = new SalesPerson("Alex", "Manager");
        person[0].addSales(2);
        person[0].addSales(3);
        salesPersons.add(person[0]);
        System.out.println(person[0]);
        
        person[1] = new SalesPerson("Steve", "Peon");
        person[1].addSales(4);
        person[1].addSales(5);
        salesPersons.add(person[1]);
        System.out.println(person[1]);
        
        person[2] = new SalesPerson("John", "Peon");
        person[2].addSales(6);
        person[2].addSales(6);
        salesPersons.add(person[2]);
        System.out.println(person[2]);
        
        System.out.println(person[0]);
        
        // TODO code application logic here
    }
    
}
