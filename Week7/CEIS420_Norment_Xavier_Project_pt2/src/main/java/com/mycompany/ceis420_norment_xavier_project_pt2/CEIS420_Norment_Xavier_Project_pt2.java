/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ceis420_norment_xavier_project_pt2;

/**
 *
 * @author never
 */
public class CEIS420_Norment_Xavier_Project_pt2 {

    public static void main(String[] args) {
        int arr[] = {0, 0, 0, 0,3, 5, 7,3,2,78,2,4,8,2, 2314,456,12,23,56,3,123,7,1};
        int n = arr.length;
 
        Qsort ob = new Qsort();
        ob.sort(arr, 0, n-1);
 
        System.out.println("sorted array");
        printArray(arr);
    }
     static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
