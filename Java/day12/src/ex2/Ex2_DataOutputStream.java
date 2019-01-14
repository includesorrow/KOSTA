/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 *
 * @author KOSTA
 */
public class Ex2_DataOutputStream {
    //�������� �ڷ������� �Բ� ����
    //����� ������� InputStream�� �о� �鿩�� �Ѵ�.
    
    private String path;
    public Ex2_DataOutputStream(){
        path = "C:\\bigdataStudy\\KOSTA\\Java\\ex2_data.txt";
    }
    //DataType�� �Բ� �Է��� ó���ϴ� �޼���
    
    public void dataWrite(){
        //�ڵ����� close�� �����Ѵ�. (���� ����)
        try(DataOutputStream dos =
                new DataOutputStream(new FileOutputStream(path))){
            //�Է� ������ �ſ� �߿��ϴ�!
            dos.write(10);
            dos.writeBoolean(true);
            dos.writeChar('A');
            dos.writeFloat(10.5f);
            dos.writeUTF("My Test");
            
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Ex2_DataOutputStream().dataWrite();
    }
    
}
