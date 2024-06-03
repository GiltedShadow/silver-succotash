/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ceis420_norment_xavier_homework_pt2;




/**
 *
 * @author never
 */
public class CEIS420_Norment_Xavier_Homework_pt2 {

    public static void main(String[] args) {
        StackClass stack = new StackClass();
        stack.push(12);
        stack.push(24);
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.top());
    }
}
class StackClass {
    private int [] stackRef;
    private int maxLen, topIndex;
    
    public StackClass() { //A constructor
        stackRef = new int[100];
        maxLen = 99;
        topIndex = -1;
    }
    
    public boolean empty() {
        return(topIndex == -1);
    }
    
    public void push(int number) {
        if (topIndex == maxLen)
            System.out.println("Error in -push --stack is full");
        else stackRef[++topIndex] = number;
    }
    
    public void pop() {
        if(empty())
            System.out.println("Error in -pop --stack is empty");
        else --topIndex;
    }
    
    public int top() {
        if(empty()) {
            System.out.println("Error in -top --stack is empty");
            return 9999;
        }
        else
            return(stackRef[topIndex]);
        }
    
}



