/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author KOSTA
 */
public class Ex4_CarMain {
    public static void main(String[] args) {
        //����, �Һ� ��ü�� �����ؼ� ������� ���� ����
        Ex4_Car_MT cm = new Ex4_Car_MT();
        Ex4_Producer producer = new Ex4_Producer(cm);
        Ex4_Customer customer = new Ex4_Customer(cm);
        
        Thread t1 = new Thread(producer, "CarMaker");
        Thread t2 = new Thread(customer, "Customer");
        //t1.setDaemon(true); //���ο� ���ӵ� daemon
        t1.start();
        t2.start();
    }
    
}
