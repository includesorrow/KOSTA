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
            //�ι�° ���� : autoFlush(�ڵ����� ������ ����ش�.)
            //new FileWriter(path)
            pw = new PrintWriter(new FileOutputStream(path),(true));
            pw.println("���� �ݰ�����!");
            //pw.flush();
                    } 
        catch (Exception ex) {
        }   finally{
            pw.close();
        }
        
        
        
        //new FileWriter�� �����ϴ�.
        //new FileOutputStream(path)�� �����ϴ�.
    }
}
