/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

/**
 *
 * @author KOSTA
 */

//스레드를 사용하는 방법 1. 상속
public class Ex2_MyThread1 extends Thread{
    
    

    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("^-------^" + getName());
    }
}
