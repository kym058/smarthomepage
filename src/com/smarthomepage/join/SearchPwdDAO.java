package com.smarthomepage.join;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.smarthomepage.util.DBmanager;

public class SearchPwdDAO {
	Connection conn; // 자바에서 멤버필드의 멤버변수는 초기화
	Statement stmt; // 하지 않아도 된다.단 지역변수라면
	ResultSet rs;   // 초기화 해야 한다.
	PreparedStatement pstmt;
	// 생성자를 싱글톤 패턴으로 생성한다.
	// private 으로 생성자를 바꾸면
	// new MemberDAO() 가 작동하지 않는다.
	// 이유는 인스턴스를 하나만 만들기 위함이다.
	private SearchPwdDAO() {
		conn = DBmanager.getConnection();
	}
	private static SearchPwdDAO instance = new SearchPwdDAO();
	public static SearchPwdDAO getInstance(){
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
	public String searchPwdByName(String name){
		String pwd ="";
		String sql = "select pwd from member where name = '"+name+"'";
		try{
			/*
			 *	커리문에서 변수를 ? 로 대체할 때는 pstmt 로 하고, 
			 * 	변수를 파라미터에서 바로받을 때는 stmt 로 한다.
			 */
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				// "pwd" 는 DB에서 컬럼명과 일치해야 한다.
				pwd = rs.getString("pwd");
			}
		}catch(Exception ex){
			ex.printStackTrace();
			System.out.println("SearchPwdDAO 에서 에러가 났음");
		}
		return pwd;
	}
}
