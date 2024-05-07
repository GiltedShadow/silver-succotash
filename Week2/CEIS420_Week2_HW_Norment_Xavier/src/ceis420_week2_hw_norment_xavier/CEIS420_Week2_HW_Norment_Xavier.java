/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ceis420_week2_hw_norment_xavier;

import java.util.Scanner;

/**
 *
 * @author Xavier Norment
 * @class CEIS420
 */
public class CEIS420_Week2_HW_Norment_Xavier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        will use multiple functions that pass a bool to create the images needed
        one for including leading spaces and one for none, then the bool will be responsible for ascending or decending
        */
        while(true){
            Scanner scannedInput = new Scanner(System.in);
            System.out.println("Please select the image to print(1-4)");
            String userInput = scannedInput.nextLine();
            switch (userInput){
                case "1": whiteSpaceLeading(true);break;
                case "2": whiteSpaceLeading(false);break;
                case "3": nonWhiteSpaceLeading(true);break;
                case "4": nonWhiteSpaceLeading(false);break;
                default: System.exit(0);
            }
        }
//        whiteSpaceLeading(true);
//        System.out.println();
//        whiteSpaceLeading(false);
//        System.out.println();
//        nonWhiteSpaceLeading(true);
//        System.out.println();
//        nonWhiteSpaceLeading(false);
        
    }
    
    public static void whiteSpaceLeading(boolean ascending){
        if(ascending){
            for(int x=0;x<10;x++){
                String toPrint = "*".repeat(x+1);
                System.out.println(String.format("%10s", toPrint));
            }
        }
        else{
            for(int x=11;x>0;x--){
                String toPrint = "*".repeat(x-1);
                System.out.println(String.format("%10s", toPrint));
            }
        }
    }
    
    public static void nonWhiteSpaceLeading(boolean ascending){
        if(ascending){
            for(int x=0;x<10;x++){
                String toPrint = "*".repeat(x+1);
                System.out.println(toPrint);
            }
        }
        else{
            for(int x=11;x>0;x--){
                String toPrint = "*".repeat(x-1);
                System.out.println(toPrint);
            }
        }
    }
    
}
