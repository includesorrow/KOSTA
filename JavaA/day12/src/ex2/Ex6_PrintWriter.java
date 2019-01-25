/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 *
 * @author KOSTA
 */
public class Ex6_PrintWriter {
    public static void main(String[] args) {
        PrintWriter pw = null;
       
        try {
            String path = "C:\\bigdataStudy\\KOSTA\\Java\\day12\\memo3.txt";
            //두번째 인자 : autoFlush(자동으로 버프를 비워준다.)
            //new FileWriter(path)
            pw = new PrintWriter(new FileOutputStream(path),(true));
            pw.println("하이 반가워요!");
            //pw.flush();
                    } 
        catch (Exception ex) {
        }   finally{
            pw.close();
        }
        
        
        
        //new FileWriter도 가능하다.
        //new FileOutputStream(path)도 가능하다.
    }
}
