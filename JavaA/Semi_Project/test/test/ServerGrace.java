package test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerGrace {

//���ۼ��� 1. ServerSocket�� �����Ѵ�.
    private ServerSocket ss;
    
// 2-1�� ���� ����
    private ArrayList<ServerThreadGrace> cList;

// Thread Group�� �����ϱ� ���� pool
    private ExecutorService executorService;

    public ServerGrace() {

        try {
            //������ ������ �� �ֵ��� port ����
            ss = new ServerSocket(9999);
            System.out.println("Server Start");
            cList = new ArrayList<>();
            executorService = Executors.newFixedThreadPool(3);
        } catch (IOException ex) {
            System.out.println("�̹� ������� port�Դϴ�");
        }
    }
    public void execute(){
        //�����ؼ� Socket�� �޴� ���񽺸� �ؾ��Ѵ�.
        //2. accept() ȣ���ؼ� ���ӵ� Socket�� ��ȯ�Ѵ�.
        
        while(true){
            try{
                //*** Socket�� �ϳ��� ���Ӹ��� ����Ѵ�.
                // ����ڿ��� ������ ������ Thread�� ���� �����ؼ�
                //start()�ϸ鼭, ������� ������ �ּҰ��� ArrqyList�� ������
                Socket s = ss.accept();
                ServerThreadGrace ct = new ServerThreadGrace(s,this);
                executorService.submit(ct); //�� ���� �־, Thread t = new Thread(); �� t.start();�� ��� ó�� ����
                 Thread t = new Thread();
                cList.add(ct);
                 t.start();
                System.out.println("Current number of Clients:" +cList.size());
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        ServerGrace server = new ServerGrace();
        server.execute();
    }
    public void sendMessage(String clientMsg){
        //���ӵ� ����ڴ� ArrayList�� ����Ǿ� �ֱ� ������
        //�� ����ڿ��� ����� �ؼ� �޼����� ���� �����Ѵ�.
        for(ServerThreadGrace e:cList){
            e.getPw().println(clientMsg);
        }
    }
}
