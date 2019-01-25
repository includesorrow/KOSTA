/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author KOSTA
 */
public class Ex2_SocketClientDemo {
    private Socket s;
    
    public Ex2_SocketClientDemo(String host, int port){
        try {
            
                        System.out.println("시작");
                        s = new Socket(host, port);
                        
                        InputStream is = s.getInputStream();
                        OutputStream os = s.getOutputStream();
                        //한줄 단위로 문자열 데이터를 보내고 싶을 때 어떤 스트림을 사용해야 할까요?
                        String msg = " 안녕하세요";
                        PrintWriter pw = new PrintWriter(os,true);
                        //이렇게 하면 버퍼기능있고 브릿지스트림 내장되어 있다.
                        pw.println(msg);//print말고println사용해야함. 그래야 리드라인이 한줄로 읽음/
//                       Scanner sc = new Scanner(is);
//                       String msg = sc.nextLine();
                       
                        
                    } catch (IOException ex) {
                        System.out.println("서버 접속에 문제가 발생했습니다.");
                        ex.printStackTrace();
                    }
    }
    public static void main(String[] args) {
        new Ex2_SocketClientDemo("192.168.0.16", 9999);
    }
    
}
