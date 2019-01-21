/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author KOSTA
 */
public class DataInput {
private String path = "C:\\bigdataStudy\\memo.txt"; //path생성

    public String getPath() {
        return path;
    }
    ///////////////데이터 입력/////////////
//    public class testWrite {
    
//            private testRead efr;
//            public testWrite(){
//            efr = new testRead();
//            } 
           
    public void execWriter(String memo){
            writeClient(memo);
       }
    public void execReader(){
        try {
        ArrayList<String> arlist = getMemo();    
        for(String e : arlist){
            System.out.println(e);
        }
        } catch (IOException ex) {
        ex.printStackTrace();
        }
        
    }

    
    
//    public class testRead {
    
//    
//    public testRead(){
//        path = "C:\\bigdataStudy\\memo.txt";
//    }
    
    
    
    
    public void writeClient(String wc){
        BufferedWriter bw = null;
        try {    
            bw = new BufferedWriter(new FileWriter(path,true));
            //문자스트림을 사용해서 경로의 문서에 작성
            bw.write(wc);
            bw.newLine();
            bw.flush(); 
        } catch (IOException ex) {
            System.out.println("문제가 발생했습니다.");
        }
        
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
    
    
    ///////////////////////////////
}
