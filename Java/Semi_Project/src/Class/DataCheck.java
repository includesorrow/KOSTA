/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author KOSTA
 */
public class DataCheck {
      public static boolean Check(String ch) throws IOException{
    
    ArrayList<String> fileList = new ArrayList<String>(); 
        String s = null;
        String strFname = null;
        
        
File file = new File("C:\\bigdataStudy\\memo.txt");
        BufferedReader buf = new BufferedReader(new FileReader(file));
        System.out.println("-=-=-=-체크스타트=-=-=-=-");
        boolean ccheck =true;

       
            while((s = buf.readLine()) != null) {
                
                
                fileList.add(s);
                
            }
                for(String fNm : fileList) {
                    if(fNm.contains(ch)) {
                        System.out.println(fNm + "is duplicated");
                        ccheck = false;  
                        
                    }
                    
                    
                }
        
	buf.close();
        System.out.println("=-=-==-체크 종료-=-=-=-");
    
       return ccheck;
}

}
