/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExampleFactory;

/**
 *
 * @author never
 */

//Main – Factory.java
public class Factory {

    public static void main(String[] args) {
        PhoneFactory pf = new PhoneFactory();
        Phone samsung= pf.getPhone("android","6 GB","64 GB","6.0 inches");
	Phone iphonex= pf.getPhone("iphone","3 GB","64 GB","5.8 inches");
	System.out.println("Android Configuration:"+samsung);
        samsung.slogan();
	System.out.println("iPhone Configuration:"+iphonex);
        iphonex.slogan();
    } 
}
