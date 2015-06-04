package com.smarthomepage.join;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.smarthomepage.util.DBmanager;

public class UpdateDAO {
	Connection conn; 
	Statement stmt; 
	ResultSet rs;   
	PreparedStatement pstmt;
	public UpdateDAO() {
		conn = DBmanager.getConnection();
	}
	private static UpdateDAO instance = new UpdateDAO();
	public static UpdateDAO getInstance(){
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
	/*
	 * 위에 부분은 완성된 DAO 에서 같이 사용해도 무방하므로
	 * 붙여넣되..클래스명만 일치시킨다.
	 * 다음으로 아래는 현재 클랫에 맞는 메소드를 생성해야 한다. 
	*/
	public void updateMember(String id, String pwd ){
		String sql ="update member set pwd = '"+pwd+"' where id = '"+id+"'";
		try{
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
		}catch(Exception ex){
			ex.printStackTrace();
			System.out.println("UpdateDAO 에서 에러 났음");
		}
	}
}
