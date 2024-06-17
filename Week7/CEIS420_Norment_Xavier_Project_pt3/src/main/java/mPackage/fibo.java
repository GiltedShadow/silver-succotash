/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mPackage;

/**
 *
 * @author never
 */
public class fibo {

    public static void main(String[] args) {
    int count = 16;
    int[] feb = new int[count];
    feb[0] = 0;
    feb[1] = 1;
      
    for(int i = 2; i < count; i++) {
        feb[i] = feb[i-1] + feb[i-2];
        } 
      
//include code here to print out the 10th element (actually feb[10] and the 15th element)
    System.out.println("The 10th number is "+feb[10]+" and the 15th number is "+feb[15]);
    }
}
