package com.smarthomepage.join;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.smarthomepage.util.DBmanager;

public class UpdateMemberInfoDAO {
	Connection conn; 
	Statement stmt; 
	ResultSet rs;   
	PreparedStatement pstmt;
	public UpdateMemberInfoDAO() {
		conn = DBmanager.getConnection();
	}
	private static UpdateMemberInfoDAO instance = new UpdateMemberInfoDAO();
	public static UpdateMemberInfoDAO getInstance(){
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
	public void updateMemberInfo(String id, String age, String name){
		String sql ="update member set name = '"+name+"', age = '"+age+"' where id = 'kim'";
		try{
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
		}catch(Exception ex){
			ex.printStackTrace();
			System.out.println("UpdateMemberInfoDAO 에서 에러 났음");
		}
	}
}