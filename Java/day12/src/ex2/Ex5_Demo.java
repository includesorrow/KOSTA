/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author KOSTA
 */
public class Ex5_Demo {
    public static void main(String[] args) throws MalformedURLException{
        BufferedReader br = null;
        System.out.println("");
        try {
            String path = "https://news.naver.com/main/read.nhn?oid=052&sid1=103&aid=0001240445&mid=shm&mode=LSD&nh=20190114114615";
            URL url = new URL(path);
            /*
            어쩔 수 없이 바이트스트림으로 받아온 객체를
            문자스트림으로 변경할려고 할 때가 있다.
            InputStreamReader(inputstream,인코딩)
            =>Scanner로 대체 가능하다. (InputStreamReader x)
            연습문제 : Scanner의 API를 참고해서
            똑같은 기능으로 Ex5_ScannerDemo에서 구현하시오.
            url.openStream() : InputStream
            */
            
         br = new BufferedReader(new InputStreamReader(url.openStream(),"euc-kr"));
         //url클래스가 접속을 할 때 text파일이 있음. (html파일) 
         //접속을 하고 났을 때 접속을 하고 끝나면 연결이 안되는거임. url이기 때문에. 
         //그래서 openstream에서 InputStream을 연결 함. 받았던 문서는 윈도우같은 경우는 temporary에 임시로 저장이 됨.
         //그걸 inputstream으로 읽어오는 역할. 읽어와서 카피를 하든지 하는데, 지금은 읽어들이는 역할만 함.
         
         // <meta charset="euc-kr">로 적혀있으므로 euc-kr를 인코딩
         String str = null;
         while((str = br.readLine()) != null){
             System.out.println(str);
         }
        
                 }
        catch (Exception e) {
        }
        
    }
    
    //URL은 OPENSTREAM만 있음. READER는 없음. 
    //이거를 문자열로 변환해야함. 
    //인코딩 : HTML 소스가 EUC-KR이니깐 받아주는쪽에서도 EUC-KR로 인코딩이 되어야 함.
    // 
    
}
