/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author KOSTA
 */
public class Ex2_DataInputStream {
    private String path;
    public Ex2_DataInputStream(){
        path = "C:\\bigdataStudy\\KOSTA\\Java\\ex2_data.txt";
    }
    public void printDataStream(){
        try {
        ArrayList<String> arlist = getMemo();    
        for(String e : arlist){
            System.out.println(e);
        }
        } catch (IOException ex) {
        ex.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        new Ex2_DataInputStream().printDataStream();
    }
    
    
    
    
    
public ArrayList<String> getMemo() throws FileNotFoundException, IOException{
ArrayList<String> ar = new ArrayList<>();
    BufferedReader br = null;
br = new BufferedReader(new FileReader(path));
String rdv = null;
//readLine() 은 스트림을 통해서 문자열을 한줄 단위로 읽어온다.
//마지막은 null
while((rdv = br.readLine()) != null){
//읽어온 문자열을 한줄씩 ArrayList에 저장
ar.add(rdv);
}
br.close();
return ar;
}

    
}
