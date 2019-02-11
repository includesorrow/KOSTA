package vo;


import java.util.List;
import java.util.ArrayList;


import org.apache.ibatis.session.SqlSession;

import mybatis.FactoryService;

public class MemberDao2 {
	private static MemberDao2 dao;
	private MemberDao2() {
		System.out.println("MemberDao2가 동작!");
	}
	public static synchronized MemberDao2 getDao() {
	if(dao == null) dao = new MemberDao2();
	return dao;
}
	public void addMember(MemberVO vo) {
		//insert, update, delete, selectList, selectOne 만 기억.
		//나머지는 API로 보기.
			SqlSession ss = FactoryService.getFactory().openSession();
			//namespace.ID
			int res = ss.insert("mem.memin",vo);
			//""는 CONFIG,MEMBER.XML에 있는 파일들을 읽어오는 방식임!!
	
			ss.commit(); //mybatis는 트랜잭션을 지원한다.
			ss.close();
			
		}
	
	
	
	
//	public List<MemberVO> getList(){
//		List<MemberVO> res = new ArrayList<MemberVO>();
//		return res;
//	}
	
//	//기존코드
//	public List<MemberVO> getList(){
//		List<MemberVO> res = new ArrayList<MemberVO>();
//		return res;
//	}
	
	public List<MemberVO> getList(){
		SqlSession ss = FactoryService.getFactory().openSession();
		List<MemberVO> res = ss.selectList("mem.memList");
		ss.close();
		return res;
	}
//	//기존코드
//	public int searchId(String id) {
//		int res = 0;
//		return res;
//				
//	}
	/*기억해야할것
	 * selectOne : 단일 쿼리,단일커서
	 * selectList 검색된 다중행 쿼리
	 */
	public int searchId(String id) {
		SqlSession ss = FactoryService.getFactory().openSession();
		int res = ss.selectOne("mem.searchid",id);
		//리스트에다 안넣어주고 해당 객체를 반환해준다고 함.
		return res;
	}
	
	
		
		
	}
	
	

