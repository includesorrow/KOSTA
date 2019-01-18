/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KOSTA
 */
public class zxc {
    public static void main(String[] args) throws FileNotFoundException {
        //파일객체생성
     
        File file = new File("C:\\bigdataStudy\\memo.txt");
            //입력 스트림 생성
            FileReader filereader = new FileReader(file);
        
                //입력 버퍼 생성
            BufferedReader bufReader = new BufferedReader(filereader);
        
            
            String line = "";
            
             
            try{
            while((line = bufReader.readLine()) != null){
                System.out.println(line);
            }
            //.readLine()은 끝에 개행문자를 읽지 않는다.            
            bufReader.close();
        }catch (FileNotFoundException e) {
            // TODO: handle exception
        }catch(IOException e){
            System.out.println(e);
        }


                
        }
       


            
            
//        while((s=br.readLine())!=null){
//
//     String line1 = br.readLine();
//     System.out.println(line1);
//            
//        }



//     BufferedReader reader1 = new BufferedReader(new FileReader("C:\\bigdataStudy\\memo.txt"));
 
  
    }   

        

