package kr.or.kosta.mvc.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.support.TransactionTemplate;

import kr.or.kosta.dto.MovieVO;

@Repository
public class DynamicExampleDao {
	private static DynamicExampleDao dao;

	@Autowired
	private SqlSessionTemplate ss;
	


	public static DynamicExampleDao getDao() {
		if (dao == null)
			dao = new DynamicExampleDao(); 
		return dao;
	}
	

	public List<MovieVO> getMovieList(Map<String, String> map) {
		List<MovieVO> list = ss.selectList("movie.movielist", map);
		return list;
	}
	
	public List<MovieVO> getMovieTitleList(Map<String, String> map) {
		List<MovieVO> list = ss.selectList("movie.movietitlelist", map);
		return list;
	}

	public List<MovieVO> getMovieList3(Map<String, String> map) {
		return ss.selectList("movie2.iftest3", map);
	}

	public void updateprice(MovieVO vo){
		ss.update("movie3.update", vo);
	}
	
	public void createmovie(MovieVO vo) {
		ss.insert("movie4.insert",vo);
	}
	
	public void deletemovie(MovieVO vo) {
		ss.delete("movie5.delete",vo);
	}
	
}
