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
public class MyThread1 extends Thread {
    Display d;
    MyThread1(Display obj){
    this.d=obj;
    }
    public void run(){
    try{
    d.display();
    }catch(InterruptedException e){
    e.printStackTrace();
    }
    }
    
}
