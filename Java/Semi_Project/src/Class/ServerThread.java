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
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 *
 * @author KOSTA
 */
public class ServerThread implements Runnable{
    private Socket socket;
    private Server server;
    private BufferedReader br;
    private PrintWriter pw;
    DataCheck dc = new DataCheck();
    DataInput di = new DataInput();
    HandleReservation hr = new HandleReservation();
    private String duplication = "duplication";

    public PrintWriter getPw() {
        return pw;
    }
    
    public ServerThread(Socket socket, Server server) throws IOException{
        
        this.socket= socket;
        this.server = server;
        System.out.println("������ IP : " + socket.getInetAddress().getHostAddress());
    }
        
        
        @Override
        public void run(){
            try {
                pw = new PrintWriter(socket.getOutputStream(),true);
                 br = new BufferedReader(
                new InputStreamReader(
                            socket.getInputStream()));
        while(true){
            String clientMsg = br.readLine();
           StringTokenizer rt = new StringTokenizer(clientMsg, "^");
    
                if(dc.Check(rt.nextToken())==true){

                  di.execWriter(rt.nextToken());
                  
                  hr.TextArray();
                 }
                else{
                    pw.println(duplication);
                }
            }
            }catch (IOException ex) {
                }
        
        }
        
    
    
    
            
  
    
}
