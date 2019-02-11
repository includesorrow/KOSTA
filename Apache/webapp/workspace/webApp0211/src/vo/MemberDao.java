package vo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conn.MyConn;

public class MemberDao {
	private static MemberDao dao;
	public static synchronized MemberDao getDao() {
	if(dao == null) dao = new MemberDao();
	return dao;
}
	public void addMember(MemberVO vo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = MyConn.getDs();
			String sql = "insert into member values(member_seq.nextVal,?,?,?,?,?,sysdate)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPwd());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getEmail());
			pstmt.setString(5, vo.getTel());
			int res = pstmt.executeUpdate();
			System.out.println("Res : " + res);
			
		
		
		}catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	
}
