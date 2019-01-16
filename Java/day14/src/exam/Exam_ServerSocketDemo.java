package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *msg.propertis 파일을 작성한다.
 * 응답할 데이터를 key=value형식으로 저장
 * 예) hi = hello
 * 예) bye = good bye!
 * 
 * 클라이언트 GUI로부터 msg를 받으면 서버는 msg.properties를 받아서
 * 클라이언트로 전송하면, 클라이언트는 서버의 응답메시지를 받아서 jTextArea에 출력
 * (심심이 프로그램 만들기)
 * 
 * 
 * @author KOSTA
 */
public class Exam_ServerSocketDemo {
//가장 기본적인 서버의 기능만 작춘 서버소켓 프로그밍을 학습한다.
           private String PROPERTIY_FILE = "C:\\bigdataStudy\\KOSTA\\Java\\day14\\src\\exam\\message.propertiy";
           Properties Message = new Properties();
           
           
           //프로퍼티 파일 가져오기
       public String getPropertyFile(String key) throws IOException{
           return Message.getProperty(key);
       }
       
       
       //프로퍼티 파일 경로 설정
       public void setPropertyFile(String path){
           this.PROPERTIY_FILE = path;
       }
       
       //KEY로 값을 가져온다
       public String getProperty(String key) throws  IOException{
           return Message.getProperty(key);
       }
       //KEY로 값을 저장한다.
       public void setProperty(String key, String value) throws IOException{
           Message.setProperty(key, value);
       }

    private ServerSocket ss;

    public Exam_ServerSocketDemo(ServerSocket ss) {
        this.ss = ss;
    }

    public Exam_ServerSocketDemo(int port) { // 9999
        try {
            //지정된 port값으로 서버 소캣을 생성한다.
            ss = new ServerSocket(port);
            System.out.println("서버시작");
            executeService();
        } catch (IOException ex) {
            System.out.println("해당 포트는 이미 사용중입니다.");
            ex.printStackTrace();
        } finally {
            try {
                if (!ss.isClosed()) { //서버가 닫혀있지 않는 경우 닫아준다.
                    ss.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(Exam_ServerSocketDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private void executeService() throws IOException {
        while (true) { //서버는 지속적으로 대기해야 한다.
            Socket s = ss.accept(); //블로킹 메소드. (클라이언트 소켓이 접속될때까지 대기.)

            //접속한 클라이언트의 아이피를 확인
            InetSocketAddress isa = (InetSocketAddress) s.getRemoteSocketAddress();
            //클라이언트 ?ㅅ으로부터 요청받아서 응답하는 구조
            InputStream is = s.getInputStream();            
            OutputStream os = s.getOutputStream();
           
//            BufferedReader bis = new BufferedReader(new InputStreamReader(is));
//            String msg = bis.readLine();
    Scanner sc=new Scanner(is);
            String msg="";
            while(sc.hasNext()){
                msg+=sc.nextLine();
                System.out.println("Client Message Log : "+sc.nextLine());
                System.out.println("message" + Message.setProperty(sc.nextLine(),Message.getProperty()));
                
                PrintWriter pw = new PrintWriter(os,true);
            
            

            System.out.println("접속자 ip 호출" + isa);
            
            
            //클라이언트로 전송
            pw.println(msg);
            s.close();
            
            
            
            
        }
    }
        
    }

    public static void main(String[] args) {
        new Exam_ServerSocketDemo(9999);
    }

    
}
