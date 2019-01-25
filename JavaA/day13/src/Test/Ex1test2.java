/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author KOSTA
 */
public class Ex1test2 implements Runnable{
     @Override
    public void run() {
      
        System.out.println("@-------@"  + Thread.currentThread().getName());
          for(int i = 0; i < 10; i++){
            System.out.println(i + " \t");
        }
    }
}
