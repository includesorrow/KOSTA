package vo;


import java.util.List;
import java.util.ArrayList;


import org.apache.ibatis.session.SqlSession;

import mybatis.FactoryService;

public class MemberDao2 {
	private static MemberDao2 dao;
	private MemberDao2() {
		System.out.println("MemberDao2�� ����!");
	}
	public static synchronized MemberDao2 getDao() {
	if(dao == null) dao = new MemberDao2();
	return dao;
}
	public void addMember(MemberVO vo) {
		//insert, update, delete, selectList, selectOne �� ���.
		//�������� API�� ����.
			SqlSession ss = FactoryService.getFactory().openSession();
			//namespace.ID
			int res = ss.insert("mem.memin",vo);
			//""�� CONFIG,MEMBER.XML�� �ִ� ���ϵ��� �о���� �����!!
	
			ss.commit(); //mybatis�� Ʈ������� �����Ѵ�.
			ss.close();
			
		}
	
	
	
	
//	public List<MemberVO> getList(){
//		List<MemberVO> res = new ArrayList<MemberVO>();
//		return res;
//	}
	
//	//�����ڵ�
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
//	//�����ڵ�
//	public int searchId(String id) {
//		int res = 0;
//		return res;
//				
//	}
	/*����ؾ��Ұ�
	 * selectOne : ���� ����,����Ŀ��
	 * selectList �˻��� ������ ����
	 */
	public int searchId(String id) {
		SqlSession ss = FactoryService.getFactory().openSession();
		int res = ss.selectOne("mem.searchid",id);
		//����Ʈ���� �ȳ־��ְ� �ش� ��ü�� ��ȯ���شٰ� ��.
		return res;
	}
	
	
		
		
	}
	
	

