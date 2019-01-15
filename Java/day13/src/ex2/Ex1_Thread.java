/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author KOSTA
 */
public class Ex1_Thread implements Runnable{
    private int value;
    
    @Override
    public void run(){
        int i = 0;
        String name = Thread.currentThread().getName();
        while(i < 3) {
            System.out.println(name + "지역변수 i 값 " + (++i));
            System.out.println(name + "멤버필드 value 값 " + (++value));
            System.out.println("ThreadActive Cnt" + Thread.activeCount());
            
            
        }
    }
    
    public static void main(String[] args) {
        Ex1_Thread r = new Ex1_Thread();
        new Thread(r).start();
        new Thread(r).start();
        
    }
    
    
}
