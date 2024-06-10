/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectMain;

/**
 *
 * @author never
 */
public class Nissan extends Car{
    private String model, style, size, special;
    
    public Nissan(String m, String st, String sz, String sp){
        model = m;
        style = st;
        size = sz;
        special = sp;
    }
    @Override
    public String getModel(){
        return this.model;
    }
    @Override
    public String getStyle(){
        return this.style;
    }
    @Override
    public String getSize(){
        return this.size;
    }
    @Override
    public String getSpecial(){
        return this.special;
    }
    public void slogan(){
        System.out.println("Innovation That Excites");
    }
}
