/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import POJO.Member;
import Interface.HandleData;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class HandleReservation implements HandleData{

   /**
 *
 * @author shin
 */
    
    ////////////////////내림차순 정렬/////////////////////////
    public void HandleReservation() throws IOException{
  System.out.println("< 텍스트 파일 불러오기 >\n");
  FileReader FR = new FileReader("C:\\bigdataStudy\\memo.txt");
  BufferedReader BR = new BufferedReader(FR);

  ArrayList<String> ArrayList = new ArrayList<String>();
  String Line;
  while ((Line = BR.readLine()) != null) {
   ArrayList.add(Line);
  }

  System.out.println("< 내림차순 정렬 전 >\n");
  for (int i = 0; i < ArrayList.size(); i++)
   System.out.println(ArrayList.get(i));

  System.out.println("\n< 정렬이 완료되었습니다. >\n");
  ArrayList = AscendingOrder(ArrayList);

  System.out.println("< 내림차순 정렬 후 >\n");
  for (int i = 0; i < ArrayList.size(); i++)
   System.out.println(ArrayList.get(i));

  System.out.println("\n< 텍스트 파일 내보내기 >\n");
  FileWriter FW = new FileWriter("C:\\bigdataStudy\\memoarray.txt");
  BufferedWriter BW = new BufferedWriter(FW);
  
  for (int i = 0; i < ArrayList.size(); i++) {
   BW.write(ArrayList.get(i));
   BW.newLine();
  }
  BR.close();
  BW.close();
  FR.close();
  FW.close();
  }
 
 public static ArrayList AscendingOrder(ArrayList<String> ArrayList) {
  String Temp;
  ArrayList<String> NewArrayList = new ArrayList<String>();
  for (int i = 0; i < ArrayList.size() - 1; i++) {
   for (int j = i + 1; j < ArrayList.size(); j++) {
    if (ArrayList.get(i).compareTo(ArrayList.get(j)) > 0) {
     Temp = ArrayList.get(i);
     ArrayList.set(i, ArrayList.get(j));
     ArrayList.set(j, Temp);
    }
   }
  }
  NewArrayList = ArrayList;
  return NewArrayList;
 }
    
    
    ///////////////데이터 입력/////////////
    public class testWrite {
    
            private testRead efr;
            public testWrite(){
            efr = new testRead();
            }
    public void execWriter(String memo){
            efr.writeClient(memo);
       }
    public void execReader(){
        try {
        ArrayList<String> arlist = efr.getMemo();    
        for(String e : arlist){
            System.out.println(e);
        }
        } catch (IOException ex) {
        ex.printStackTrace();
        }
        
    }
}
    
    
    public class testRead {
    private String path; //path생성
    
    public testRead(){
        path = "C:\\bigdataStudy\\memo.txt";
    }
    
    
    
    
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
    }
    
    ///////////////////////////////
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public Member load() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Member m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Member m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
