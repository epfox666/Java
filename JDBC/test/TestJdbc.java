package com.tarena.test;
import java.sql.*;
public class TestJdbc {
   public static void main(String[] args) {
	Connection con =null;
	PreparedStatement pstm =null;
	ResultSet rs =null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/netctoss";
		String usr="root";
		String pwd="1234";
		con=DriverManager.getConnection(url,usr,pwd);
		System.out.println(con);
		String sql="select * from cost;";
		pstm=con.prepareStatement(sql);
		rs=pstm.executeQuery();
		while(rs.next()) {
			int id =rs.getInt("id");
			String name=rs.getString("name");
			System.out.println(id+","+name);
		}
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if(pstm!=null) {
			try {
				pstm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
}
