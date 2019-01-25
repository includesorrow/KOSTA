/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KOSTA
 */
public class Ex4_Producer implements Runnable{
    private Ex4_Car_MT car;
    public Ex4_Producer(Ex4_Car_MT car) {this.car = car;}

    @Override
    public void run() {
    String carName = "";
    for(int i = 0; i < 20; i++){
        carName = car.getCar();
        Thread t = Thread.currentThread();
        car.push(carName, t);
        
        try {
            Thread.sleep((int)(Math.random()*200));
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        
        
    }
    
    }
    
}
