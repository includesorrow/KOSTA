/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 *
 * @author KOSTA
 */
public class Ex2_DataOutputStream {
    //데이터의 자료형까지 함께 저장
    //저장된 순서대로 InputStream에 읽어 들여야 한다.
    
    private String path;
    public Ex2_DataOutputStream(){
        path = "C:\\bigdataStudy\\KOSTA\\Java\\ex2_data.txt";
    }
    //DataType과 함께 입력을 처리하는 메서드
    
    public void dataWrite(){
        //자동으로 close를 수행한다. (버전 주의)
        try(DataOutputStream dos =
                new DataOutputStream(new FileOutputStream(path))){
            //입력 순서가 매우 중요하다!
            dos.write(10);
            dos.writeBoolean(true);
            dos.writeChar('A');
            dos.writeFloat(10.5f);
            dos.writeUTF("My Test");
            
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Ex2_DataOutputStream().dataWrite();
    }
    
}
