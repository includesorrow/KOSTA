/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author KOSTA
 */
public class Ex3_ObjectInputStream {
    
    
    //기존코드
    public static void main(String[] args) {
        ObjectInputStream ois = null;
        
        try {
            String path = "C:\\bigdataStudy\\KOSTA\\Java\\day12\\ex3_obj.txt";
            ois = new ObjectInputStream(new FileInputStream(path));
            
            //역직렬화 (객체조립)
            Ex3_Member v = (Ex3_Member) ois.readObject();
            System.out.println("id : " + v.getId());
            System.out.println("name : " + v.getName());
            System.out.println("PWD : " + v.getPwd());
            System.out.println("age : " + v.getAge());
            System.out.println("pay : " + v.getPay());
            
            
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex){
            ex.printStackTrace();
        } finally {
            try { 
                ois.close();
            }catch (IOException ex){
                
            }
        }
    }
    
}
