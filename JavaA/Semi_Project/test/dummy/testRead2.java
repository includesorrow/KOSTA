/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author KOSTA
 */
public class testRead2 {
    
    public testRead2(String ll) throws IOException{
         BufferedReader reader1 = new BufferedReader(new FileReader("C:\\bigdataStudy\\memo.txt"));
        
        
        String line1 = reader1.readLine();
        String line2 = ll;
        System.out.println("출력 " +line1);
        
        boolean areEqual = true;
        
        int lineNum = 1;
        
        while (line1 != null)
        {
            if(line1 == null)
            {
                areEqual = false;
                
                break;
            }
            
            line1 = reader1.readLine();
            
            
            lineNum++;
        }
        
        if(areEqual)
        {
            System.out.println("Two files have same content.");
        }
        else
        {
            System.out.println("Two files have different content. They differ at line "+lineNum);
            
            System.out.println("File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
        }
        
        reader1.close();
        
    }
    
    
}

