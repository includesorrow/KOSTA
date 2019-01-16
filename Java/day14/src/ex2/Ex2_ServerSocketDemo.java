package ex2;

import ex1.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
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
public class Ex2_ServerSocketDemo {
//���� �⺻���� ������ ��ɸ� ���� �������� ���α׹��� �н��Ѵ�.

    private ServerSocket ss;

    public Ex2_ServerSocketDemo(ServerSocket ss) {
        this.ss = ss;
    }

    public Ex2_ServerSocketDemo(int port) { // 9999
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
                Logger.getLogger(Ex2_ServerSocketDemo.class.getName()).log(Level.SEVERE, null, ex);
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
           
            BufferedReader bis = new BufferedReader(new InputStreamReader(is));
            String msg = bis.readLine();
            System.out.println("Client Message Log : " + msg);

            System.out.println("������ ip ȣ��" + isa);
            s.close();
            
        }
    }

    public static void main(String[] args) {
        new Ex2_ServerSocketDemo(9999);
    }

}
