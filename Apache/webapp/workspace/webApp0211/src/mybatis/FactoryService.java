package mybatis;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class FactoryService {
	private static SqlSessionFactory factory;
	//오브젝트 팩토리 패턴. 세션의 공장. 세션이 뭐냐?
	//여기서 말하느 것은 SQLSession임.
	//일단 이 팩토리는 SQLSession이라는 것을 만들고 반환해주는 역할을 함.
	//액션팩토리는 액션을 만들고 반환하는 공장같은 역할을 함.
	//지금 보기만 하면 SQL에 대한 액션을 만들고 반환해주는 역할 공장과 같은 역할.
	
	static {
		try {
			//1. 마이바티스의 환경설정 파일을 읽어온다.
			Reader reader = Resources.getResourceAsReader("config/config.xml");
			factory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	//factory를 반환하는 메서드를 정의
	public static SqlSessionFactory getFactory() {
		return factory;
	}
	
}
