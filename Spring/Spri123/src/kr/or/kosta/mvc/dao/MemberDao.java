package kr.or.kosta.mvc.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.kosta.dto.MyMemVO;


@Repository
public class MemberDao implements MemberDaoInter{
	//Respository = DAO단 구성
	/*
	 * 해당 클래스가 DAO인 것을 알려주기 위해서 @Repository라고 적어준다.
	 */

	@Autowired
	private SqlSessionTemplate ss;

	@Override
	public void addMem(MyMemVO vo) {
		ss.insert("mymember.join",vo);
		
	}

	@Override
	public int idChk(String id) {
		return ss.selectOne("mymember.idChk",id);
	}
	
	
	
	
}
