/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author never
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
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
	
	
            
               JSONParser jpar= new JSONParser();
	   JSONObject obj = (JSONObject)jpar.parse(new InputStreamReader(content, "UTF-8"));
    
        System.out.println("JSON Object: " + obj);
        

        JSONArray ja = (JSONArray)obj.get("postalcodes");
       
       Iterator i = ja.iterator();
       
        
     while(i.hasNext())
     {
         JSONObject j = (JSONObject) i.next();
         Double lat = (Double) j.get("lat");
         Double lng = (Double) j.get("lng");
         System.out.println("Latitude is "+lat.toString()+" and Longitdue is "+lng.toString());
     }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
                }
    }
}

    

