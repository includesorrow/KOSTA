package ex1;


import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KOSTA
 */


public class Ex1_ServerSocketDemo {
//가장 기본적인 서버의 기능만 작춘 서버소켓 프로그밍을 학습한다.
    private ServerSocket ss;

    public Ex1_ServerSocketDemo(ServerSocket ss) {
        this.ss = ss;
    }

    public Ex1_ServerSocketDemo(int port) { // 9999
        try {
            //지정된 port값으로 서버 소캣을 생성한다.
            ss = new ServerSocket(port);
            System.out.println("서버시작");
//            executeService();
        } catch (IOException ex) {
            System.out.println("해당 포트는 이미 사용중입니다.");
            ex.printStackTrace();
        } finally {
            try {
                if(!ss.isClosed()){ //서버가 닫혀있지 않는 경우 닫아준다.
                    System.out.println("서버가 닫혔습니다.");
                ss.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(Ex1_ServerSocketDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    
    }

    private void executeService() throws IOException{
        while(true){ //서버는 지속적으로 대기해야 한다.
            Socket s = ss.accept(); //블로킹 메소드. (클라이언트 소켓이 접속될때까지 대기.)
            
            //접속한 클라이언트의 아이피를 확인
            InetSocketAddress isa = (InetSocketAddress) s.getRemoteSocketAddress();
            System.out.println("접속자 ip 호출" + isa);
        }
    }
    
    public static void main(String[] args) {
        new Ex1_ServerSocketDemo(9999);
    }
    
    
}
