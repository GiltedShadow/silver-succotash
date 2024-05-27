/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ceis420_norment_xavier_project_pt1;

/**
 *
 * @author never
 */
public class CEIS420_Norment_Xavier_Project_pt1 {

    public static void main(String[] args) {
//        for (int i = 1; i<= n; i++){
//            innerBreak = false;
//            for (int j = 1; j <= n; j++){
//                if(x[i][j] != 0){
//                    innerBreak = true;
//                    break;
//                }
//            }
//            if (!innerBreak){
//                System.out.println("First -all--zero row is" + i);
//            }
//            break;
//        }
        for (int x = 0; x<100; x++){
            for (int y = 0; y<100; y++){
                if (y==20){
                    System.out.println("Breaking y");
                    break;
                }
                System.out.println("x = " + x + "y = " + y);
            }
            if (x==20){
                break;
            }
        }
    }
}
