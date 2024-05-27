/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package msystem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author never
 */
public class CEIS420_Norment_Xavier_Project_pt2 {

    public static void main(String[] args) {
        Pattern phoneNumber = Pattern.compile("\\(?\\d{3}\\)?[. -]? *\\d{3}[. -]? *[. -]?\\d{4}");
        Matcher that = phoneNumber.matcher("512-293-5436");
        System.out.println(that.find());
        System.out.println("Hello World!");
        
    }
    public Boolean findPhoneNumber(String checkThis){
        Pattern phoneNumber = Pattern.compile("\\(?\\d{3}\\)?[. -]? *\\d{3}[. -]? *[. -]?\\d{4}");
        Matcher checkingPossible = phoneNumber.matcher(checkThis);
        return checkingPossible.find();
    }
}
