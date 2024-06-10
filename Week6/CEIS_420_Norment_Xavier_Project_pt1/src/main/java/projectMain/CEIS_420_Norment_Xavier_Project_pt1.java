/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package projectMain;

/**
 *
 * @author never
 */
public class CEIS_420_Norment_Xavier_Project_pt1 {

    public static void main(String[] args) {
        CarFactory cf = new CarFactory();
        
        Car camry = cf.getCar("toyota", "Camry", "sedan", "mid-size", "high mpg with hybrid available");
        Car maverick = cf.getCar("ford", "Maverick", "pickup", "small", "hybrid available");
        Car bolt = cf.getCar("chevy", "Bolt", "hatchback", "subcompact", "full electric (EV)");
        Car versa = cf.getCar("nissan", "Versa", "sedan", "compact", "cheapest new car on the US open market");
        System.out.println("Camry configuration: "+camry);
        camry.slogan();
        System.out.println("Maverick configuration: "+maverick);
        maverick.slogan();
        System.out.println("Bolt Configuration: "+bolt);
        bolt.slogan();
        System.out.println("Versa configuration: "+versa);
        versa.slogan();
    }
}
