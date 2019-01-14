/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author KOSTA
 */
public class Ex5_ScannerDemo {
    public static void main(String[] args) throws MalformedURLException{
        String path = "https://news.naver.com/main/read.nhn?oid=052&sid1=103&aid=0001240445&mid=shm&mode=LSD&nh=20190114114615";
        URL url = new URL(path);
        //implements Iterator<String>. 반복자를 사용할 수 있다 *********
        //InputStreamReader 브릿지, 버퍼를 내부적으로 캡슐화
        try(Scanner sc = new Scanner(url.openStream(), "euc-kr")){
            String rdv = null;
            while (sc.hasNext()){
                System.out.println(sc.nextLine());
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
