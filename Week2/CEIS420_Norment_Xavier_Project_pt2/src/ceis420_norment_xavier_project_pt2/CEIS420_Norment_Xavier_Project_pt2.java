/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ceis420_norment_xavier_project_pt2;


/**
 *
 * @author never
 */
public class CEIS420_Norment_Xavier_Project_pt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start, stop, startTwo, stopTwo=0;
		start = System.nanoTime();
		for (int i=0;i<100;i++)
		{
			System.out.println(" The number is "+i);
			
		}
		stop = System.nanoTime()-start;
                
                startTwo = System.nanoTime();
                for(int x=0;x<100;x++){
                    System.out.printf(" The number is %d \n", x);
                }
                stopTwo = System.nanoTime()-start;
                
	System.out.println("It took "+stop+" nano seconds for println to run");
        System.out.println("It took "+stopTwo+" nano seconds for printf to run");
	}   
}
