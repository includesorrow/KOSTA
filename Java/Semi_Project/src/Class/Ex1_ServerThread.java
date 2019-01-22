/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KOSTA
 */
public class Ex1_ServerThread implements Runnable{
    private Socket socket;
    private Ex1_Server server;
    private BufferedReader br;
    private PrintWriter pw;
    //�������� ��ε�ĳ������ �ϱ� ���ؼ�
    //Ŭ���̾�Ʈ�� ����� ��Ʈ������ ����ϱ� ����
    //PrintWriter�� �ּҸ� �����Ѵ�.
    public PrintWriter getPw() {
        return pw;
    }
    
    public Ex1_ServerThread(Socket socket, Ex1_Server server) throws IOException{
        this.socket= socket;
        this.server = server;
        System.out.println("������ IP : " + socket.getInetAddress().getHostAddress());
        
    }
        
        
        @Override
        public void run(){
            try {
                pw = new PrintWriter(socket.getOutputStream(),true);
                //readLine()�� ���
                 br = new BufferedReader(
                new InputStreamReader(
                            socket.getInputStream()));
        //������� �������κ��� �޽����� ��� �޾ƾ� �Ѵ�.
        while(true){
            String clientMsg = br.readLine();
            System.out.println("Log  : " + clientMsg);
            server.sendMessage(clientMsg);
        } 
            }catch (IOException ex) {
                }
        
        }
        
    
    
    
    
  
    
}
