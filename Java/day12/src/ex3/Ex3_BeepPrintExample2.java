/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;
//로컬익명내부클래스

import java.awt.Toolkit;

/**
 *
 * @author KOSTA
 */
public class Ex3_BeepPrintExample2 {
    public static void main(String[] args) {
        //쓰레드를 익명 내부클래스로 정의하는 방법
        Thread thread = new Thread(){
            //로컬익명내부클래스
         

            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for(int i = 0; i < 5; i++){
                    toolkit.beep();
                    try {
                    Thread.sleep(500);
               
                    } catch (Exception e) {
                    }
                     }
                super.run(); //To change body of generated methods, choose Tools | Templates.
            }
        };
//        thread.start();
//        
            for(int i = 0; i < 5; i++){
                System.out.println("띵");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        
        
        
        
    }
}
