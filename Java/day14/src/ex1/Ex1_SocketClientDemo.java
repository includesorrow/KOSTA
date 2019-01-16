/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KOSTA
 */
public class Ex1_SocketClientDemo {
    private Socket s;
    
    public Ex1_SocketClientDemo(String host, int port){
        try {
                        s = new Socket(host, port);
                        System.out.println("gg");
                    } catch (IOException ex) {
                        System.out.println("서버 접속에 문제가 발생했습니다.");
                        ex.printStackTrace();
                    }
    }
    public static void main(String[] args) {
        new Ex1_SocketClientDemo("192.168.0.16", 9999);
    }
    
}
