/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ceis420_norment_xavier_homework_pt1;

/**
 *
 * @author never
 */
public class CEIS420_Norment_Xavier_Homework_pt1 {

    public static void main(String[] args) {
        int k=0, j=0;
        
        switch (k){
            case 1, 2:
                j=2*k-1;
                break;
            case 3, 5:
                j=3*k+1;
                break;
            case 4:
                j=4*k-1;
                break;
            case 6, 7, 8:
                j=k-2;
                break;
            default:
                j=0;
                break;
        }
        System.out.println("Hello World!");
    }
}
