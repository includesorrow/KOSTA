/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author KOSTA
 */
public class Ex3_CalcThread extends Thread{
    public Ex3_CalcThread(String name){
        setName(name);
    }
    public void run(){
        for(int i= 0; i < 2000000000; i++){
            
        }
        System.out.println(getName());
    }
    
    
}
