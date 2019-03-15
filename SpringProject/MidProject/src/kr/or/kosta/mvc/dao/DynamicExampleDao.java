package kr.or.kosta.mvc.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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


}
