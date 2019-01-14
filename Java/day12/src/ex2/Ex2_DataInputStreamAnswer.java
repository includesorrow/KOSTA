/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.io.DataInputStream;
import java.io.FileInputStream;


/**
 *
 * @author KOSTA
 */
public class Ex2_DataInputStreamAnswer {
    private String path;
    public Ex2_DataInputStreamAnswer(){
        path = "C:\\bigdataStudy\\KOSTA\\Java\\ex2_data.txt";
    }
    public void printDataStream(){
        try(DataInputStream dis = new DataInputStream(new FileInputStream(path))){
            System.out.println("Ãâ·Â ----------");
            System.out.println("int : " + dis.readInt());
            System.out.println("boolean : " + dis.readBoolean());
            System.out.println("char : " + dis.readChar());
            System.out.println("Float : " + dis.readFloat());
            System.out.println("String : " + dis.readUTF());
            
        }catch (Exception e){
            
        }
            
    
    
    
    
    }
    
    public static void main(String[] args) {
        new Ex2_DataInputStreamAnswer().printDataStream();
    }
}
    
    
    
    