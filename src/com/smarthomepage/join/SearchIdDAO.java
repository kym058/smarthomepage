package com.smarthomepage.join;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.smarthomepage.util.DBmanager;

public class SearchIdDAO {
	Connection conn; // 자바에서 멤버필드의 멤버변수는 초기화
	Statement stmt; // 하지 않아도 된다.단 지역변수라면
	ResultSet rs;   // 초기화 해야 한다.
	PreparedStatement pstmt;
	// 생성자를 싱글톤 패턴으로 생성한다.
	// private 으로 생성자를 바꾸면
	// new MemberDAO() 가 작동하지 않는다.
	// 이유는 인스턴스를 하나만 만들기 위함이다.
	private SearchIdDAO() {
		conn = DBmanager.getConnection();
	}
	private static SearchIdDAO instance = new SearchIdDAO();
	public static SearchIdDAO getInstance(){
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
	public String searchId(String name){
		String id = "";
		String sql = "select id from member where name = '"+name+"'";
		try{
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				id = rs.getString("id");
			}
		}catch(Exception ex){
			ex.printStackTrace();
			System.out.println("searchIdDAO 에서 에러가 났음");
		}
		return id;
	}
}
