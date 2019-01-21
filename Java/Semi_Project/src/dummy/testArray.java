/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author KOSTA
 */
public class TestArray {
    
 //public static void main(String[] args) throws IOException {
  public void TestArray() throws IOException{
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
}

