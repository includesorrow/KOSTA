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
public class Ex3_PriorityExample {
    
    public static void main(String[] args) {    
        for(int i = 1; i <= 10; i++){
            //우선순위 1(낮은값) ~ 10(최대값)까지이며
            Thread thread = new Ex3_CalcThread("Thread" + i);
            if(i != 10){
                thread.setPriority(Thread.MIN_PRIORITY); //1
                
            } else{
                thread.setPriority(thread.MAX_PRIORITY); // 10가장높음
            }
            thread.start();
        }
    }

    public Ex3_PriorityExample() {
    }
    
}
