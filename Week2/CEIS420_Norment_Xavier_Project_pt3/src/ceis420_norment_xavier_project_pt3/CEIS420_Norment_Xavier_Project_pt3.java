/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ceis420_norment_xavier_project_pt3;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author Xavier Norment
 * @class CEIS420
 */
public class CEIS420_Norment_Xavier_Project_pt3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList fixedArray = new ArrayList(10000000);
        ArrayList dynamicArray = new ArrayList();
        
        BigDecimal fixedStart, dynamicStart, fixedStop, dynamicStop;
        BigDecimal fixedEnd, dynamicEnd;
        BigDecimal secondFix = BigDecimal.valueOf(1000000000L);
        fixedStart = BigDecimal.valueOf(System.nanoTime());
        for(int x =0; x<10000000; x++){
            fixedArray.add(x);
        }
        fixedStop = BigDecimal.valueOf(System.nanoTime());
        dynamicStart = BigDecimal.valueOf(System.nanoTime());
        for(int x =0; x<10000000; x++){
            dynamicArray.add(x);
        }
        dynamicStop = BigDecimal.valueOf(System.nanoTime());
        System.out.println(fixedStop);
        System.out.println(dynamicStop);
        fixedEnd = (fixedStop.subtract(fixedStart)).divide(secondFix);
        dynamicEnd = (dynamicStop.subtract(dynamicStart).divide(secondFix));
        System.out.printf("It took %.5f seconds for a fixed array\nIt took %.5f seconds for a dynamic array", fixedEnd, dynamicEnd);
    }
}
