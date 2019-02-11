package mybatis;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class FactoryService {
	private static SqlSessionFactory factory;
	//������Ʈ ���丮 ����. ������ ����. ������ ����?
	//���⼭ ���ϴ� ���� SQLSession��.
	//�ϴ� �� ���丮�� SQLSession�̶�� ���� ����� ��ȯ���ִ� ������ ��.
	//�׼����丮�� �׼��� ����� ��ȯ�ϴ� ���尰�� ������ ��.
	//���� ���⸸ �ϸ� SQL�� ���� �׼��� ����� ��ȯ���ִ� ���� ����� ���� ����.
	
	static {
		try {
			//1. ���̹�Ƽ���� ȯ�漳�� ������ �о�´�.
			Reader reader = Resources.getResourceAsReader("config/config.xml");
			factory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	//factory�� ��ȯ�ϴ� �޼��带 ����
	public static SqlSessionFactory getFactory() {
		return factory;
	}
	
}
