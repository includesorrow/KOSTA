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
public class Ex1 {
    //요구사항 : 0~10까지 출력하는 스레드를 만들어라.
    public static void main(String[] args) throws InterruptedException{
        
    
      Ex1test em = new Ex1test();
      Ex1test em2 = new Ex1test();
      
      em.run();
      em.join();
      em2.run();
}
}
