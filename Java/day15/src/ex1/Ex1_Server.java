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
     * bind() : port socket에 대한 정보를 할당
     * listen() : 클라이언트의 접속 요청을 확인
     * accept() : 클라이언트의 소켓을 생성
     * 
     * Ex1_Server
     * 1. ServerSocket을 생성한다.
     * 2. accept() 호출해서 접속된 Socket을 반환한다
     * 2-1 다중접속자를 처리하기 위해서 ArrayList를 사용한다.
     * 3. Socket에서 제공하는 Stream으로 통신한다
     * 3-1 readLine()을 담당해줄 Thread를 제작한다
     * 
     * 참고 : 특별한 요청이 없을 때는 GUI로 서버를 제작하지는 않는다.
     */
    public static void main(String[] args) {
        
        
        // TODO code application logic here
    }
    
}
