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
public class Ex2_MyRunnable1 implements Runnable{
    //Thread�� ������ Ŭ�����̱� ������ �߻�޼����� run()��
    //������ �ִ�. ���� getName()�� ����Ϸ���
    //���� �������� �ּҸ� �����ͼ� �Ʒ�ó�� ����Ѵ�.
    

    @Override
    public void run() {
    // ������ ���ÿ��� run()ȣ��� �������� �ּ� ��.    
         System.out.println("@-------@" + Thread.currentThread().getName());
    }

}
