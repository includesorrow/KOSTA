/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author KOSTA
 */
public class Ex3_FileReWrDemo {
    private String path;
    /*
    @see �⺻������, �����δ� window�� c...
    */
    public Ex3_FileReWrDemo(){
        path = "C:\\bigdataStudy\\KOSTA\\Java\\memo.txt";
    }
    /*
    @param msg�� memo.txt���� BufferedWriter�� ����ؼ� ���ڿ��� ����Ǳ� ���� ��Ʈ��
    */
    public void writeMemo(String msg) {
        //���� ����� ���� ���� ��Ʈ��(2�� ��Ʈ��)
        BufferedWriter bw = null;
        try{
            bw = new BufferedWriter(new FileWriter(path, true));
            //���� ��Ʈ���� ����ؼ� �ش� ����� ������ �ۼ�
            bw.write(msg);
            bw.newLine();//����
            bw.flush();//���۸� ����ִ� ���
        } catch (IOException ex) {
            
        } finally{
            if(bw != null){
                
               //Ʈ���� ĳġ�� ����¹��.     
                try {
                    bw.close();
                } catch (IOException ex){
                }
            }
            }
        }
        
    
    

/*
    
*/
public ArrayList<String> getMemo() throws FileNotFoundException, IOException{
    ArrayList<String> ar = new ArrayList<>();
    BufferedReader br = null;
br = new BufferedReader(new FileReader(path));
String rdv = null;
//readLine() �� ��Ʈ���� ���ؼ� ���ڿ��� ���� ������ �о�´�.
//�������� null
while((rdv = br.readLine()) != null){
//�о�� ���ڿ��� ���پ� ArrayList�� ����
ar.add(rdv);
}
br.close();
return ar;
}

    }