/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;
//��ũ�γ������ : ��������ȭ��

/**
 *
 * @author KOSTA
 */
public class Ex3_Synchronized_Account {
    private int balance;

    public synchronized void withdraw(int money){
        
        
        //withdraw ö���ϴ�, ������ ��
    if(balance >= money){
        try {
            Thread.sleep(1000);
            balance -= money;
        } catch (InterruptedException ex) {
            ex.printStackTrace();}
    }    
    }
    //���ü��� ������ �߻�.

    public synchronized int getBalance() {
        return balance;
    }
    
    public synchronized void setBalance(int balance) {
        this.balance = balance;
        System.out.println("�˻� : " + balance);
    }
    
}
