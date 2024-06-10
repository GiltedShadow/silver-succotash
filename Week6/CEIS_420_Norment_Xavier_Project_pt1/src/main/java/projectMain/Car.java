/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectMain;

/**
 *
 * @author never
 */
public abstract class Car {
    public abstract String getModel();
    public abstract String getStyle();
    public abstract String getSize();
    public abstract String getSpecial();
    public abstract void slogan();
        @Override
        public String toString(){
            return "Model is "+this.getModel()+" in "+this.getStyle()+" style that is "+
                    this.getSize()+". Special features to follow: \n"+this.getSpecial();
        }
}
