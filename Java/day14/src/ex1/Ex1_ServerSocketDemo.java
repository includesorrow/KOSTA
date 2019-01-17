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
//���� �⺻���� ������ ��ɸ� ���� �������� ���α׹��� �н��Ѵ�.
    private ServerSocket ss;

    public Ex1_ServerSocketDemo(ServerSocket ss) {
        this.ss = ss;
    }

    public Ex1_ServerSocketDemo(int port) { // 9999
        try {
            //������ port������ ���� ��Ĺ�� �����Ѵ�.
            ss = new ServerSocket(port);
            System.out.println("��������");
//            executeService();
        } catch (IOException ex) {
            System.out.println("�ش� ��Ʈ�� �̹� ������Դϴ�.");
            ex.printStackTrace();
        } finally {
            try {
                if(!ss.isClosed()){ //������ �������� �ʴ� ��� �ݾ��ش�.
                    System.out.println("������ �������ϴ�.");
                ss.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(Ex1_ServerSocketDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    
    }

    private void executeService() throws IOException{
        while(true){ //������ ���������� ����ؾ� �Ѵ�.
            Socket s = ss.accept(); //���ŷ �޼ҵ�. (Ŭ���̾�Ʈ ������ ���ӵɶ����� ���.)
            
            //������ Ŭ���̾�Ʈ�� �����Ǹ� Ȯ��
            InetSocketAddress isa = (InetSocketAddress) s.getRemoteSocketAddress();
            System.out.println("������ ip ȣ��" + isa);
        }
    }
    
    public static void main(String[] args) {
        new Ex1_ServerSocketDemo(9999);
    }
    
    
}
