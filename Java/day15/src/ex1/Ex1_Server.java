/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author KOSTA
 */
public class Ex1_Server {

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
    public static void main(String[] args) {
        
        
        // TODO code application logic here
    }
    
}
