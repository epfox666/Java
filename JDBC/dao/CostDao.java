package com.tarena.dao;
import com.tarena.entity.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
public class  CostDao {
	public List<Cost> selectAll(){
	List<Cost> costs=new ArrayList<Cost>();
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
				Cost cost=new Cost();
				cost.setId(rs.getInt("id"));
				cost.setName(rs.getString("name"));
				cost.setBaseDuration(rs.getInt("base_duration"));
				cost.setBaseCost(rs.getDouble("base_cost"));
				cost.setUnitCost(rs.getDouble("unit_cost"));
				cost.setDescr(rs.getString("descr"));
				cost.setCreateTime(rs.getDate("create_time"));
				costs.add(cost);
				
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
		return costs;
	}
}
