/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectMain;

/**
 *
 * @author never
 */
public class CarFactory {
    public Car getCar(String makeName, String m, String st, String sz, String sp){
        if (makeName.equalsIgnoreCase("toyota"))
            return new Toyota(m, st, sz, sp);
        else if (makeName.equalsIgnoreCase("Ford"))
            return new Ford(m, st, sz, sp);
        else if (makeName.equalsIgnoreCase("chevy"))
            return new Chevy(m, st, sz, sp);
        else if (makeName.equalsIgnoreCase("nissan"))
            return new Nissan(m, st, sz, sp);
        else
            return null;
    }

}
