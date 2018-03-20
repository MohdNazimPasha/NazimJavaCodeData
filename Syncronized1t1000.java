/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assig15m;

/**
 *
 * @author Nazim
 */
public class Syncronized1t1000 {
    public static void main(String []arg){
    Display d=new Display();
    MyThread1 t1=new MyThread1(d);
    MyThread2 t2=new MyThread2(d);
    t1.start();
    t2.start();
    
    }
    
}
