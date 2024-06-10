/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExampleFactory;

/**
 *
 * @author never
 */
//Android.java – subclass 1
public class Android extends Phone{
        private String ram;
	private String storage;
	private String size;
	
	public Android(String r, String s, String sz){
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
            System.out.println("Be together, not the same");
        }
}
