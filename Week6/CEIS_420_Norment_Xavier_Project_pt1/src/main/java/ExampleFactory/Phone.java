/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExampleFactory;

/**
 *
 * @author never
 */
public abstract class Phone {
    //The abstract methods in Phone must be implemented in the subclasses
    public abstract String getRAM();
    public abstract String getStorage();
    public abstract String getSize();
    public abstract void slogan();
    	@Override
	public String toString(){
		return "RAM= "+this.getRAM()+", Storage="+this.getStorage()+", Size="+this.getSize();
	}
}
