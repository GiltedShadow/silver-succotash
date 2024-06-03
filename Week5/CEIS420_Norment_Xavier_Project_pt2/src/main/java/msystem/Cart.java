/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package msystem;

import java.util.ArrayList;

/**
 *
 * @author never
 */
public class Cart {
    public static ArrayList Cart = new ArrayList();
    public static void main(String[] args) {
        
        System.out.println("Hello World!");
    }
    
    public static void addToCart(String item){
        Cart.add(item);
        System.out.println("Added " + item + " to cart");
    }
    
    public static void removeFromCart(String item){
        Cart.remove(item);
        System.out.println("Removed "+ item + " from cart");
    }
    
    public static void resetCart(){
        Cart.clear();
        System.out.println("Cart has been cleared");
    }
}
