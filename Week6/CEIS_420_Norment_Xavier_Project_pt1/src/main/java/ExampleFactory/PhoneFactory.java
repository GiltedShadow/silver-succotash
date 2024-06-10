/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExampleFactory;

/**
 *
 * @author never
 */
//PhoneFactory – factory class that instantiates the object requested
public class PhoneFactory {
    public Phone getPhone(String PhoneType, String r, String s, String sz)
    {
        //Create object here
        if(PhoneType.equalsIgnoreCase("ANDROID"))
            return new Android(r, s, sz); 
        else if(PhoneType.equalsIgnoreCase("IPHONE"))
            return new iPhone(r, s, sz); 
       else
            return null;
    }
}
