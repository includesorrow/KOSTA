/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author KOSTA
 */
public class GetUserInfo implements Runnable {

	//통신할 서버 포트  선언

    public static final int SERVERPORT = 8059;           

    @Override

    public void run() {

        // TODO Auto-generated method stub        

         //title 문자열 변수에는 핸드폰의 번호가 들어갑니다.

    	 String title="";

    	 //str 문자열 변수에는 제가 얻고자 하는 정보가 들어있습니다.

         String str="";

        try{

            System.out.println("S: Connecting...");

            ServerSocket serverSocket = new ServerSocket(SERVERPORT);

            

            while (true) {

                Socket client = serverSocket.accept();

                System.out.println("S: Receiving...");

                try {

                    //BufferReader에 소켓 클라이언트로부터 가져온 스트림을 저장합니

                	BufferedReader in = 
new BufferedReader(new InputStreamReader(client.getInputStream(),"utf-8"));

                	title = in.readLine();

                    str = in.readLine();  

                    

                   //전화번호를 파일명으로 하여 텍스트파일을 생성합니다. 

                   //파일 저장은 현재 소스파일과 같은 폴더에 저장합니다.

                   BufferedWriter out = new BufferedWriter(new FileWriter(title+".txt"));

                   

                   //생성된 텍스트 파일 안에 저장할 내용입니다.

                    out.write(str); out.newLine();

                    out.close();




                } catch(Exception e) {

                    System.out.println("S: Error");

                    e.printStackTrace();

                } finally {

                    client.close();

                    System.out.println("S: Done.");

                }

            }

        } catch (Exception e) {

            System.out.println("S: Error");

            e.printStackTrace();

        }

    }


 /**

  * @param args

  */

    public static void main(String[] args) {

  // TODO Auto-generated method stub

      Thread desktopServerThread = new Thread(new GetUserInfo());

      desktopServerThread.start();

     }

}