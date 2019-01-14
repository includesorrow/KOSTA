/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author KOSTA
 */
public class Ex3_ObjectStream {
    public static void main(String[] args) {
        String path = "C:\\bigdataStudy\\KOSTA\\Java\\ex3_obj.txt";
        
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))){
            //직렬화 대상이 되는 객체 * (Serializable 인터페이스를 구현)
            Ex3_Member v = new Ex3_Member();
            v.setId("xman");
            v.setPwd("1");
            v.setAge(30);
            v.setName("홍길동");
            v.setPay(2000);
            //직렬화
            oos.writeObject(v);

            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    }
    

