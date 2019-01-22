package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ServerThreadGrace implements Runnable {

    private Socket socket;
    private ServerGrace server;
    private BufferedReader br;
    private PrintWriter pw;
    private JSONParser parser;
    private final String member = "C:\\bigdataStudy\\java\\netwokrspace\\Semi_Project\\src\\GUI\\JsonGrace.json";

    //�������� ��ε�ĳ������ �ϱ� ���ؼ� Ŭ���̾�Ʈ�� ����� ��Ʈ������ ����ϱ� ���� PrintWriter�� �ּҸ� ����
    public PrintWriter getPw() {
        return pw;
    }

    public ServerThreadGrace(Socket socket, ServerGrace server) {
        this.socket = socket;
        this.server = server;
        parser = new JSONParser();
        System.out.println("������ IP: " + socket.getInetAddress().getHostAddress());
    }

    @Override
    public void run() {
        try {
            pw = new PrintWriter(socket.getOutputStream(), true);

            // readLine() �� ���
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            //����� �������κ��� �޼����� ��� �޾ƾ� �Ѵ�.
            while (true) {
                String clientMsg = br.readLine();
                System.out.println(clientMsg);
//                server.sendMessage(clientMsg);
                StringTokenizer stz = new StringTokenizer(clientMsg,"/");
                String token = stz.nextToken();
//                if (!clientMsg.equals(null)) {
//                    server.sendMessage(clientMsg);
//                } else 
                if (token.equals("id_check")) {
                    // "id_check/���̵�/null/null"
                    // �ߺ�Ȯ���ϴ� ����
                    JSONObject obj = (JSONObject) parser.parse(new FileReader("C:\\bigdataStudy\\java\\netwokrspace\\Semi_Project\\src\\GUI\\JsonGrace.json"));
                    Set ids = obj.keySet();
                    if (!ids.contains(stz.nextToken())) {
                        System.out.println("true");
                        pw.println("id_check/true/");
                    } else {
                        System.out.println("false");
                        pw.println("id_check/false/");
                    }
                    // ���̵� üũ�ϴ� ����
                } else if (token.equals("join")) {
                    // "join/���̵�/��й�ȣ/����ó"
                    String id = stz.nextToken();
                    // ȸ�������ϴ� ����
                }
            }
        } catch (IOException ex) {
        } catch (ParseException ex) {
        }
    }
}
