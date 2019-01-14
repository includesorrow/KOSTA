/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author KOSTA
 */
public class Ex4_InputStreamReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        try {
            String path = "C:\\bigdataStudy\\KOSTA\\Java\\day12\\memo.txt";
            //InputStreamReader : 바이트를 문자로 연결해주는 스트림
            br = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
            String str = null;
            while((str = br.readLine()) != null)
            {
                System.out.println(str);
            }
        
            } 
                catch (FileNotFoundException ex) {
                 ex.printStackTrace();
                }
    }
    
}
