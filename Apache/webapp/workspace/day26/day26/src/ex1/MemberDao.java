package ex1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MemberDao {
	private static MemberDao dao;
	private MemberDao() {}
	public static synchronized MemberDao getDao() {
		if(dao==null) dao=new MemberDao();
		return dao;
	}
	public void addMemeber(MemberVO vo) {
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			con=MyConn.getDs();
			String sql="insert into member values(member_seq.nextval,?,?,?,?,?,sysdate)";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPwd());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getEmail());
			pstmt.setString(5, vo.getTel());
			int res=pstmt.executeUpdate();
			System.out.println("RES : "+res);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(con!=null) con.close();
				if(pstmt!=null)	pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
