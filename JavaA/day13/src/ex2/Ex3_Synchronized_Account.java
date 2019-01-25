/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;
//싱크로나이즈드 : 동시통합화된

/**
 *
 * @author KOSTA
 */
public class Ex3_Synchronized_Account {
    private int balance;

    public synchronized void withdraw(int money){
        
        
        //withdraw 철수하다, 빼내다 등
    if(balance >= money){
        try {
            Thread.sleep(1000);
            balance -= money;
        } catch (InterruptedException ex) {
            ex.printStackTrace();}
    }    
    }
    //동시성의 문제가 발생.

    public synchronized int getBalance() {
        return balance;
    }
    
    public synchronized void setBalance(int balance) {
        this.balance = balance;
        System.out.println("검사 : " + balance);
    }
    
}
