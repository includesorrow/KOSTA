/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Server {
    
    private ServerSocket ss;
    //2-1�� ���� ����
    private ArrayList<ServerThread> cList;
    //ThreadGroup�� �����ϱ� ���� pool
    private ExecutorService executorService;
    public Server(){     
            try {
            ss = new ServerSocket(9999);
            System.out.println("Server Start!");
            cList = new ArrayList <>();
            executorService = Executors.newFixedThreadPool(3);
        } catch (IOException ex) {
            System.out.println("�̹� ������� port�Դϴ�.");
         
                    }
    }
    
    
    
    
    public void execute(){
        while(true){
            Socket s;
            try {
                s = ss.accept();
                ServerThread ct = new ServerThread(s, this);
                executorService.submit(ct);
                cList.add(ct);
                System.out.println("Current number of Clients"+cList.size());
            } catch (IOException ex) {
                    ex.printStackTrace();
            }
        
        
        }
    }
   public static void main(String[] args) {
        Server server= new Server();
        server.execute();
    }
    public void sendMessage(String clientMsg){
        for(ServerThread e : cList){
        e.getPw().println(clientMsg);
    }
    }
    
    
    
    
    
}
