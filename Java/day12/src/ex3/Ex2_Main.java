/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

/**
 *
 * @author KOSTA
 */
public class Ex2_Main {
    //쓰레드는 순수가 없고, 실행되는 시점이 명확하지 않다.
    public static void main(String[] args) {
        Ex2_MyThread1 em = new Ex2_MyThread1();
        em.start();
        
        //스레드 상속은 바로 튀어나온다.
        //em.start();
        
        
        /*
        runnable
        -> start
        -> runable
        -> run
        -> running
        ->dead상태
        running에서 runable로 다시 돌아갈 수 있다.
        start는 재사용이 불가능하다. 1번만 호출이 가능하다.
        
        
        
        */
       
        
        
        //Runnable 인터페이스를 구현한 클래스
        Thread t1 = new Thread(new Ex2_MyRunnable1());
        t1.start();
        //메인메서드에게 지연시간을 주기 위해서 반복
        for(int i = 0; i < 10; i++){
            System.out.println(i + " \t");
        }
        
    }
}
