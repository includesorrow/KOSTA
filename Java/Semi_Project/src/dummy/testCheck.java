/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummy;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KOSTA
 */
public class testCheck {


//    public static void main(String[] args) throws IOException{
//        
//   ArrayList<String> fileList = new ArrayList<String>(); 
//        String s = null;
//        String strFname = null;
//
//File file = new File("C:\\bigdataStudy\\memo.txt");
//        BufferedReader buf = new BufferedReader(new FileReader(file));
//        System.out.println("-=-=-=-체크스타트=-=-=-=-");
//
//
//while((s = buf.readLine()) != null) {
//	strFname = strSplit(s);
//	for(String fNm : fileList) {
//		if(fNm.equals(strFname)) {
//		                  System.out.println(fNm + "is duplicated");	
//			}
//		}
//		fileList.add(strSplit(s));
//
//	}
//	buf.close();
//        System.out.println("=-=-==-체크 종료-=-=-=-");
//    }
//

    public static String strSplit(String fileName) throws IOException{
          ArrayList<String> fileList = new ArrayList<String>(); 
        String s = null;
        String strFname = null;

File file = new File("C:\\bigdataStudy\\memo.txt");
        BufferedReader buf = new BufferedReader(new FileReader(file));
        System.out.println("-=-=-=-체크스타트=-=-=-=-");


       
            while((s = buf.readLine()) != null) {
                strFname = strSplit(s);
                for(String fNm : fileList) {
                    if(fNm.equals(strFname)) {
                        System.out.println(fNm + "is duplicated");
                    }
                }
                fileList.add(strSplit(s));
                
            }
        
	buf.close();
        System.out.println("=-=-==-체크 종료-=-=-=-");
    
    return null;
}
}
