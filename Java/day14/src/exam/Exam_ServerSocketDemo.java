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
 *msg.propertis ������ �ۼ��Ѵ�.
 * ������ �����͸� key=value�������� ����
 * ��) hi = hello
 * ��) bye = good bye!
 * 
 * Ŭ���̾�Ʈ GUI�κ��� msg�� ������ ������ msg.properties�� �޾Ƽ�
 * Ŭ���̾�Ʈ�� �����ϸ�, Ŭ���̾�Ʈ�� ������ ����޽����� �޾Ƽ� jTextArea�� ���
 * (�ɽ��� ���α׷� �����)
 * 
 * 
 * @author KOSTA
 */
public class Exam_ServerSocketDemo {
//���� �⺻���� ������ ��ɸ� ���� �������� ���α׹��� �н��Ѵ�.
           private String PROPERTIY_FILE = "C:\\bigdataStudy\\KOSTA\\Java\\day14\\src\\exam\\message.propertiy";
           Properties Message = new Properties();
           
           
           //������Ƽ ���� ��������
       public String getPropertyFile(String key) throws IOException{
           return Message.getProperty(key);
       }
       
       
       //������Ƽ ���� ��� ����
       public void setPropertyFile(String path){
           this.PROPERTIY_FILE = path;
       }
       
       //KEY�� ���� �����´�
       public String getProperty(String key) throws  IOException{
           return Message.getProperty(key);
       }
       //KEY�� ���� �����Ѵ�.
       public void setProperty(String key, String value) throws IOException{
           Message.setProperty(key, value);
       }

    private ServerSocket ss;

    public Exam_ServerSocketDemo(ServerSocket ss) {
        this.ss = ss;
    }

    public Exam_ServerSocketDemo(int port) { // 9999
        try {
            //������ port������ ���� ��Ĺ�� �����Ѵ�.
            ss = new ServerSocket(port);
            System.out.println("��������");
            executeService();
        } catch (IOException ex) {
            System.out.println("�ش� ��Ʈ�� �̹� ������Դϴ�.");
            ex.printStackTrace();
        } finally {
            try {
                if (!ss.isClosed()) { //������ �������� �ʴ� ��� �ݾ��ش�.
                    ss.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(Exam_ServerSocketDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private void executeService() throws IOException {
        while (true) { //������ ���������� ����ؾ� �Ѵ�.
            Socket s = ss.accept(); //���ŷ �޼ҵ�. (Ŭ���̾�Ʈ ������ ���ӵɶ����� ���.)

            //������ Ŭ���̾�Ʈ�� �����Ǹ� Ȯ��
            InetSocketAddress isa = (InetSocketAddress) s.getRemoteSocketAddress();
            //Ŭ���̾�Ʈ ?�����κ��� ��û�޾Ƽ� �����ϴ� ����
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
            
            

            System.out.println("������ ip ȣ��" + isa);
            
            
            //Ŭ���̾�Ʈ�� ����
            pw.println(msg);
            s.close();
            
            
            
            
        }
    }
        
    }

    public static void main(String[] args) {
        new Exam_ServerSocketDemo(9999);
    }

    
}
