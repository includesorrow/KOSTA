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

/**
 *
 * @author KOSTA
 */

    /**
     * server : socket -> [bind() -> listen()] -> accept -> Stream() -> close()
     * bind() : port socket�� ���� ������ �Ҵ�
     * listen() : Ŭ���̾�Ʈ�� ���� ��û�� Ȯ��
     * accept() : Ŭ���̾�Ʈ�� ������ ����
     * 
     * Ex1_Server
     * 1. ServerSocket�� �����Ѵ�.
     * 2. accept() ȣ���ؼ� ���ӵ� Socket�� ��ȯ�Ѵ�
     * 2-1 ���������ڸ� ó���ϱ� ���ؼ� ArrayList�� ����Ѵ�.
     * 3. Socket���� �����ϴ� Stream���� ����Ѵ�
     * 3-1 readLine()�� ������� Thread�� �����Ѵ�
     * 
     * ���� : Ư���� ��û�� ���� ���� GUI�� ������ ���������� �ʴ´�.
     */
    
    //arraylist���� ������ ����. �������� ������.
public class Ex1_Server {
    
   //���ۼ��� : 1. ServerSocket�� �����ϰ� �����Ѵ�.
    private ServerSocket ss;
    //2-1�� ���� ����
    private ArrayList<Ex1_ServerThread> cList;
    //ThreadGroup�� �����ϱ� ���� pool
    private ExecutorService executorService;
    public Ex1_Server(){
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
        //�����ؼ� Socket�� �޴� ���񽺸� �ؾ� �Ѵ�.
        //2. accept() ȣ���ؼ� ���ӵ� Socket�� ��ȯ�Ѵ�.
        while(true){
            //**********������ �ϳ��� �����ڸ��� ����Ѵ�.
            //����ڿ��� ������ ������ Thread�� ���� �����ؼ�
            //start()�ϸ鼭 ������� ���� �ּҰ���
            //ArrayList�� �����ߴ�.
            Socket s;
            try {
                s = ss.accept();
                Ex1_ServerThread ct = new Ex1_ServerThread(s, this);
                executorService.submit(ct);
                //Thread t = new Thread(ct); << �̰� executeService�� ����Ǹ� �� ���嵵 �ڵ����� �����
                cList.add(ct);
                //t.start();<< �̰� clist.add(ct);�� ����Ǹ� �� ���嵵 �ڵ����� �����
                System.out.println("Current number of Clients"+cList.size());
            } catch (IOException ex) {
                    ex.printStackTrace();
            }
        
        
        }
    }
   public static void main(String[] args) {
        Ex1_Server server = new Ex1_Server();
        server.execute();
    }
    public void sendMessage(String clientMsg){
        //���ӵ� ����ڴ� ArrayList�� ����Ǿ� �ֱ� ������
        //�� ����ڿ��� ����� �ؼ� �޽����� ���� �����Ѵ�.
        for(Ex1_ServerThread e : cList){
        e.getPw().println(clientMsg);
    }
    }
    
    
    
    
    
}
