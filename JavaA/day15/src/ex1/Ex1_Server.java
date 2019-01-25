/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KOSTA
 */

    /**
     * server : socket -> [bind() -> listen()] -> accept -> Stream() -> close()
     * bind() : port socket에 대한 정보를 할당
     * listen() : 클라이언트의 접속 요청을 확인
     * accept() : 클라이언트의 소켓을 생성
     * 
     * Ex1_Server
     * 1. ServerSocket을 생성한다.
     * 2. accept() 호출해서 접속된 Socket을 반환한다
     * 2-1 다중접속자를 처리하기 위해서 ArrayList를 사용한다.
     * 3. Socket에서 제공하는 Stream으로 통신한다
     * 3-1 readLine()을 담당해줄 Thread를 제작한다
     * 
     * 참고 : 특별한 요청이 없을 때는 GUI로 서버를 제작하지는 않는다.
     */
    
    //arraylist에는 소켓이 들어옴. 소켓이자 쓰레드.
public class Ex1_Server {
    
   //제작순서 : 1. ServerSocket을 선언하고 생성한다.
    private ServerSocket ss;
    //2-1을 위한 선언
    private ArrayList<Ex1_ServerThread> cList;
    //ThreadGroup을 관리하기 위한 pool
    private ExecutorService executorService;
    public Ex1_Server(){
        try {
            ss = new ServerSocket(9999);
            System.out.println("Server Start!");
            cList = new ArrayList <>();
            executorService = Executors.newFixedThreadPool(3);
        } catch (IOException ex) {
            System.out.println("이미 사용중인 port입니다.");
         
                    }
    }
    
    
    
    
    public void execute(){
        //지속해서 Socket을 받는 서비스를 해야 한다.
        //2. accept() 호출해서 접속된 Socket을 반환한다.
        while(true){
            //**********소켓은 하나의 접속자만을 담당한다.
            //사용자에게 응답을 위임한 Thread를 각각 생성해서
            //start()하면서 사용자의 소켓 주소값을
            //ArrayList에 저장했다.
            Socket s;
            try {
                s = ss.accept();
                Ex1_ServerThread ct = new Ex1_ServerThread(s, this);
                executorService.submit(ct);
                //Thread t = new Thread(ct); << 이건 executeService가 실행되면 이 문장도 자동으로 실행됨
                cList.add(ct);
                //t.start();<< 이건 clist.add(ct);가 실행되면 이 문장도 자동으로 실행됨
                System.out.println("Current number of Clients"+cList.size());
            } catch (IOException ex) {
                    ex.printStackTrace();
            }
        
        
        }
    }
   public static void main(String[] args) {
        Ex1_Server server = new Ex1_Server();
        server.execute();
    }
    public void sendMessage(String clientMsg){
        //접속된 사용자는 ArrayList에 저장되어 있기 때문에
        //그 사용자에게 통신을 해서 메시지를 각각 전송한다.
        for(Ex1_ServerThread e : cList){
        e.getPw().println(clientMsg);
    }
    }
    
    
    
    
    
}
