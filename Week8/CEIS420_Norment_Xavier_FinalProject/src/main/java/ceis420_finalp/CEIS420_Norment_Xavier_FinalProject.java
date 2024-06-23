/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ceis420_finalp;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Collections;

/**
 *
 * @author never
 */
public class CEIS420_Norment_Xavier_FinalProject {
    public static ArrayList<SalesPerson> salesPersons = new ArrayList<>();
    public static void main(String[] args) {
        createSalesPerson(3);
        createReport(salesPersons);
    }
    
    public static void createSalesPerson(int numberOfPeople){
        String inputName, inputTitle;
        int salesAmt;
        SalesPerson[] person = new SalesPerson[numberOfPeople];
        Scanner input = new Scanner(System.in);
        for (int x=0;x<numberOfPeople;x++){
            System.out.print("Please enter the sales persons name: ");
            inputName = input.nextLine();
            System.out.print("Please enter the sales persons rank: ");
            inputTitle = input.nextLine();
            System.out.print("How many sales figures are you entering for "+inputName+"? ");
            salesAmt = input.nextInt();
            
            person[x] = new SalesPerson(inputName, inputTitle);
            for (int y=0;y<salesAmt;y++){
                System.out.print("Please enter a sales figure for "+inputName+": ");
                person[x].addSales(input.nextDouble());
            }
            System.out.println("---------------------");
            input.nextLine();
        }
        Collections.addAll(salesPersons, person);
    }
            
    public static void createReport(ArrayList<SalesPerson> salesPeople){
        double companyTotal = 0.0;
        DecimalFormat fmt = new DecimalFormat("$#,#00.00");
        Iterator<SalesPerson> iterPerson = salesPeople.iterator();
        while (iterPerson.hasNext()){
            SalesPerson s = iterPerson.next();
            double total = 0.0;
            double sale = 0.0;
            double min = 9999999.9;
            double max = 0.0;
            double avg = 0.0;
            int count = 0;
            Iterator<Double> iterSales = s.iterSales();
            while (iterSales.hasNext()){
                sale = iterSales.next();
                total += sale;
                if (sale < min){
                    min = sale;
                }
                if (sale > max){
                    max = sale;
                }
                count += 1;
            }
            avg = total/count;
            companyTotal += total;
            System.out.println("Sales Person:  "+ s.getName());
            System.out.println("Title:         "+ s.getTitle());
            System.out.println("Total Sales:   "+ fmt.format(total));
            System.out.println("Min Sales:     "+ fmt.format(min));
            System.out.println("Max Sales:m    "+ fmt.format(max));
            System.out.println("Average Sales: "+ fmt.format(avg));
            System.out.println("-----------------------------");
        }
        System.out.println("Company Total Sales: "+ fmt.format(companyTotal));
    }  
}
