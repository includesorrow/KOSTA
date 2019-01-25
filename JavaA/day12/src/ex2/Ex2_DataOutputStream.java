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
 //???????? ????????? ??? ????
    //????? ??????? InputStream?? ?¬à? ???? ???.
    
    private String path;
    public Ex2_DataOutputStream(){
        path = "C:\\bigdataStudy\\KOSTA\\Java\\ex2_data.txt";
    }
    //DataType?? ??? ????? ?????? ?????
    
    public void dataWrite(){
        //??????? close?? ???????. (???? ????)
        try(DataOutputStream dos =
                new DataOutputStream(new FileOutputStream(path))){
            //??? ?????? ??? ??????!
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
