/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import ex2.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author KOSTA
 */
public class Exam_SocketClientDemo {
    private Socket s;
    
    public Exam_SocketClientDemo(String host, int port){
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
                       BufferedReader bis = new BufferedReader(new InputStreamReader(is));
                       String servermsg = bis.readLine();
                       System.out.println("����" + servermsg);
                        
                    } catch (IOException ex) {
                        System.out.println("���� ���ӿ� ������ �߻��߽��ϴ�.");
                        ex.printStackTrace();
                    }
    }
    public static void main(String[] args) {
        new Exam_SocketClientDemo("192.168.0.16", 9999);
    }
    
}
