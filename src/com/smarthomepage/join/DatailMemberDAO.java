package com.smarthomepage.join;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.smarthomepage.util.DBmanager;

public class DatailMemberDAO {
	Connection conn; 
	Statement stmt; 
	ResultSet rs;   
	PreparedStatement pstmt;
	public DatailMemberDAO() {
		conn = DBmanager.getConnection();
	}
	private static DatailMemberDAO instance = new DatailMemberDAO();
	public static DatailMemberDAO getInstance(){
		return instance;
	}
	public Connection getConnection() throws Exception{
		Connection conn = null;
		Context initContext = new InitialContext();
		Context envContext = (Context) initContext.lookup("java:/comp/env");
		DataSource ds = (DataSource) envContext.lookup("jdbc/myoracle");
		conn = ds.getConnection();
		return conn;
	}
	public  MemberBean getMemberInfo(String id){
		String sql = "select * from member where id = '"+id+"'";
		MemberBean bean = new MemberBean();
		try{
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				bean.setId(rs.getString("id"));
				bean.setName(rs.getString("name"));
				bean.setAge(rs.getString("age"));
				bean.setGender(rs.getString("gender"));
			}
		}catch(Exception ex){
			ex.printStackTrace();
			System.out.println("DatailMemberDAO 에서 에러 남");
		}
		return bean;
	}
		
}