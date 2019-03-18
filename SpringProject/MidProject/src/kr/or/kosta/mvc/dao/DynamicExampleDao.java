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
	
	public List<MovieVO> getMovieTitleList(Map<String, String> map) {
		List<MovieVO> list = ss.selectList("movie.movietitlelist", map);
		return list;
	}
	

	// choose 예제
	public List<MovieVO> getSawonChooseList(Map<String, String> map) {
		List<MovieVO> list = ss.selectList("movie2.chooseTest", map);
		return list;
	}

	public List<MovieVO> getMovieList3(Map<String, String> map) {
		return ss.selectList("movie2.iftest3", map);
	}
	
	
//	// choose 예제
//		public List<SawonVO> getSawonChooseList(Map<String, String> map) {
//			List<SawonVO> list = ss.selectList("exam3.chooseTest", map);
//			return list;
//		}
//
//		public List<SawonVO> getSawonList3(Map<String, String> map) {
//			return ss.selectList("exam3.iftest3", map);
//		}

}
