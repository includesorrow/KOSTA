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
            
                        System.out.println("����");
                        s = new Socket(host, port);
                        
                        InputStream is = s.getInputStream();
                        OutputStream os = s.getOutputStream();
                        //���� ������ ���ڿ� �����͸� ������ ���� �� � ��Ʈ���� ����ؾ� �ұ��?
                        String msg = " �ȳ��ϼ���";
                        PrintWriter pw = new PrintWriter(os,true);
                        //�̷��� �ϸ� ���۱���ְ� �긴����Ʈ�� ����Ǿ� �ִ�.
                        pw.println(msg);//print����println����ؾ���. �׷��� ��������� ���ٷ� ����/
//                       Scanner sc = new Scanner(is);
//                       String msg = sc.nextLine();
                       
                        
                    } catch (IOException ex) {
                        System.out.println("���� ���ӿ� ������ �߻��߽��ϴ�.");
                        ex.printStackTrace();
                    }
    }
    public static void main(String[] args) {
        new Ex2_SocketClientDemo("192.168.0.16", 9999);
    }
    
}
