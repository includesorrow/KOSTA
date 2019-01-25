/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author KOSTA
 */
public class dummmmmy {
    //if(dc.Check(reserveymdh)==true){
dc : 데이터 체크 클래스
DC.Check : dc클래스의 check
dc.Check(reserveymdh) < 년도/일자 등등 체크
dc.Check(reserveymdh)==true
 중복값이 있는지 체크하고 그게 중복값이 없을 때 true를 출력.
그래서 true가 출력되면
 LabelError.setText("예약이 완료되었습니다!");
예약이 완료되었습니다 를 라벨에 출력
LabelError.setForeground(Color.blue);
라벨 색을 파란색으로 설정
di.execWriter(reserveinfofull);
di < 데이터 인풋
di.execWriter(reserveinfo)
이건 reserveinfo라는 스트링을 execWriter에 넣어서 입력하게 만드는거임.
hr.TextArray();
hr.testArray
HandleReservastion 클래스의 textArray();
파일이 추가가 되면 그 파일을 순번대로 정렬한다. 이는 hr의 textArray참고
                    try {
                        stt.ServerThreadTest();
                    } catch (Exception ex) {
                        Logger.getLogger(Shin_GUI.class.getName()).log(Level.SEVERE, null, ex);
                    }


                    pw.println(reserveinfo + " 로 예약되었습니다.");
예약정보를 textArea로 출력함.
                    
                     try {
                      stt.ServerThreadTest();
                       } catch (Exception ex) {
                           ex.printStackTrace();
                      }

                }
                else{

                    LabelError.setForeground(Color.GREEN);
                    //중복일시에 텍스트컬러를 초록색으로 바꿈.

                    LabelError.setText("이미 예약되어 있습니다. 다른 시간에 예약하세요.");
                    //dc.Check(reserveymdh)==false이면
                    //다른시간에 예약되었다고 출력하게 만듬

                }
}
