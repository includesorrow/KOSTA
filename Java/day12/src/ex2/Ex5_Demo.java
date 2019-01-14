/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author KOSTA
 */
public class Ex5_Demo {
    public static void main(String[] args) throws MalformedURLException{
        BufferedReader br = null;
        System.out.println("");
        try {
            String path = "https://news.naver.com/main/read.nhn?oid=052&sid1=103&aid=0001240445&mid=shm&mode=LSD&nh=20190114114615";
            URL url = new URL(path);
            /*
            ��¿ �� ���� ����Ʈ��Ʈ������ �޾ƿ� ��ü��
            ���ڽ�Ʈ������ �����ҷ��� �� ���� �ִ�.
            InputStreamReader(inputstream,���ڵ�)
            =>Scanner�� ��ü �����ϴ�. (InputStreamReader x)
            �������� : Scanner�� API�� �����ؼ�
            �Ȱ��� ������� Ex5_ScannerDemo���� �����Ͻÿ�.
            url.openStream() : InputStream
            */
            
         br = new BufferedReader(new InputStreamReader(url.openStream(),"euc-kr"));
         //urlŬ������ ������ �� �� text������ ����. (html����) 
         //������ �ϰ� ���� �� ������ �ϰ� ������ ������ �ȵǴ°���. url�̱� ������. 
         //�׷��� openstream���� InputStream�� ���� ��. �޾Ҵ� ������ �����찰�� ���� temporary�� �ӽ÷� ������ ��.
         //�װ� inputstream���� �о���� ����. �о�ͼ� ī�Ǹ� �ϵ��� �ϴµ�, ������ �о���̴� ���Ҹ� ��.
         
         // <meta charset="euc-kr">�� ���������Ƿ� euc-kr�� ���ڵ�
         String str = null;
         while((str = br.readLine()) != null){
             System.out.println(str);
         }
        
                 }
        catch (Exception e) {
        }
        
    }
    
    //URL�� OPENSTREAM�� ����. READER�� ����. 
    //�̰Ÿ� ���ڿ��� ��ȯ�ؾ���. 
    //���ڵ� : HTML �ҽ��� EUC-KR�̴ϱ� �޾��ִ��ʿ����� EUC-KR�� ���ڵ��� �Ǿ�� ��.
    // 
    
}
