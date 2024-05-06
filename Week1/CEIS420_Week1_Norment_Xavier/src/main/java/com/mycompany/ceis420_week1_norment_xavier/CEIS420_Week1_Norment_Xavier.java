/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ceis420_week1_norment_xavier;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author never
 */
public class CEIS420_Week1_Norment_Xavier {

    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
		String s1="http://api.geonames.org/postalCodeLookupJSON?postalcode=";
		  
			 String s2="";
			 System.out.println("Please enter the postal code: ");
			 s2 = input.nextLine(); //Ask the user for the country code
                         String s3 = s1+s2+"&country=US&username=devry";
                       //concatenate string for the RESTful web service
		
		  URL url;
		try {
			url = new URL(s3);//Set up string as a URL
	  
		  HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	    connection.setRequestMethod("GET");
	  
	    InputStream content = (InputStream) connection.getInputStream();
	    BufferedReader in = new BufferedReader(new InputStreamReader(content)); //Read data from input stream
	    String line;
	    while ((line = in.readLine()) != null) { //Loop and print to console
	        System.out.println(line);
	}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

    }

}
