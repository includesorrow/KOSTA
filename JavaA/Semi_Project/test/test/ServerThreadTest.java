/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Class.*;
import POJO.Member;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import GUI.Shin_GUI;


/**
 *
 * @author KOSTA
 */
public class ServerThreadTest implements Runnable{
  HandleReservation hr = new HandleReservation(); //hr 생성
DataInput di = new DataInput(); //di 생성
DataCheck dc = new DataCheck(); //dc 생성
Member member = new Member(); //멤버생성
ServerThreadTest stt;
Shin_GUI sg = new Shin_GUI();


    private Socket socket;
    private Server server;
    private BufferedReader br;
    private PrintWriter pw;

    //서버에서 브로드캐스팅을 하기 위해서
    //클라이언트와 연결된 스트림으로 통신하기 위한
    //PrintWriter의 주소를 제공한다.
    public PrintWriter getPw() {
        return pw;
    }
    
    public ServerThreadTest(Socket socket, Server server) throws IOException{
        this.socket= socket;
        this.server = server;
        System.out.println(" " + socket.getInetAddress().getHostAddress());
        
    }
        
        
        @Override
        public void run(){
            
              di.execWriter(sg.getReserveinfofull());
      try {
          hr.TextArray();
      } catch (IOException ex) {
          Logger.getLogger(ServerThreadTest.class.getName()).log(Level.SEVERE, null, ex);
      }
          }
          
          
          
          
          
          
//            try {
//                pw = new PrintWriter(socket.getOutputStream(),true);
//                //readLine()을 담당
//                 br = new BufferedReader(
//                new InputStreamReader(
//                            socket.getInputStream()));
//        //사용자의 소켓으로부터 메시지를 계속 받아야 한다.
//        while(true){
//            String clientMsg = br.readLine();
//            System.out.println("Log  : " + clientMsg);
//            server.sendMessage(clientMsg);
//        } 
//            }catch (IOException ex) {
//                        
        }
        
        
    

    
    
  
    

