/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummy;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author KOSTA
 */
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
        
    /*
    List<String> fileList = new ArrayList<String();
String s = null;
String strFname = null;
File file = new File(" " );
BufferedReader buf = new BufferedReader(new FileReader(file));
sysout // 체크스타트


while((s = buf.readLine()) != null) {
	strFname = strSplit(s);
	for(String fNm : filelist) {
		if(fNm.equals(strFname)) {
			sysout // fNm + "is duplicated");
			}
		}
		fileList.add(strSplit(s));

	}
	buf.close();
	sysout"check complite"
}

main

int cutLocation = fileName.lastIndexOf("/") + i;
string name = fileN
    */
    
    
    
    public static void main(String[] args){
        testWrite mains = new testWrite();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("memo : ");
        mains.execWriter(sc.nextLine());
        mains.execReader();
        
        
    }
    
    
}