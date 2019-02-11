package ex1;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MyConn {
	private static DataSource ds;
	static {
		try {
			InitialContext ctx=new InitialContext();
			ds=(DataSource) ctx.lookup("java:comp/env/jdbc/myora"); 
			//�����(datasource)�� �ڵ��ȣ
			//object�� �����ϱ⿡ datasource�� ĳ����
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getDs() throws SQLException {
		return ds.getConnection();
	}
	
}
