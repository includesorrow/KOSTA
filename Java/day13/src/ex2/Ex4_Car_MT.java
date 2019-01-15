/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.util.ArrayList;

/**
 *
 * @author KOSTA
 */
public class Ex4_Car_MT {
    //생산할 자동차를 저장할 ArrayList선언
    private ArrayList<String> carList;
    public Ex4_Car_MT() {
        carList = new ArrayList<>();
    }
    public String getCar(){
        String carName = "";
        int carNum = (int) (Math.random() *3);
        //자동차를 제작해서 반환 해주느 ㄴ구문!
        switch(carNum){
            case 0 : carName = "뉴그랜저1" ; 
            break;
            case 1 : carName = "뉴그랜저2" ;
            break;
            case 2 : carName = "뉴그랜저3" ;
            break;
        }
        return carName;
    }
    public synchronized String pop(Thread t){
        String carName="";
        if(carList.size()==0){
            System.out.println("생산된 자동차가 없습니다.");
            System.out.println("생산이 완료될 때 까지 대기실에서");
            System.out.println("커피한잔하세요");
            System.out.println("------------------");
            
            
            try {
                wait();
            } catch (InterruptedException ex) {
                
            }
        }
        carName = carList.remove(carList.size() -1);
        System.out.println("손님은 차를 구입했습니다.");
        System.out.println("구입한 차의 정보 : =>>>");
        System.out.println(carName + " : " + t.getName());
        return carName;
    }
    public synchronized void push(String car, Thread t){
        carList.add(car);
        System.out.println("주문하신 " + car + "자동차가 만들어졌습니다.");
        System.out.println("Thread" + t.getName());
        if(carList.size() == 5){
        notify();
    }
    }
}
