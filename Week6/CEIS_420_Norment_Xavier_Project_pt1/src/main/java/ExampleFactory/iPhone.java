/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExampleFactory;

/**
 *
 * @author never
 */
//iPhone.java – subclass 2
public class iPhone extends Phone {
            private String ram;
	private String storage;
	private String size;
	
	public iPhone(String r, String s, String sz){
		ram=r;
		storage=s;
		size=sz;
	}
	@Override
	public String getRAM() {
		return this.ram;
	}

	@Override
	public String getStorage() {
		return this.storage;
	}

	@Override
	public String getSize() {
		return this.size;
	}
        public void slogan()
        {
            System.out.println("Think different");
        }
}
