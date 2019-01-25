/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.awt.Toolkit;

/**
 *
 * @author KOSTA
 */
public class dummy {
    public static void main(String[] args) {
        
    
    Thread thread = new Thread(){
            //로컬익명내부클래스
         

            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for(int i = 0; i < 10; i++){
                    toolkit.beep();
                    try {
                    Thread.sleep(500);
               
                    } catch (Exception e) {
                    }
                     }
                super.run(); //To change body of generated methods, choose Tools | Templates.
            }
        };
        thread.start();
        
            for(int i = 0; i < 5; i++){
                System.out.println("띵");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        
        
           
    }
}
