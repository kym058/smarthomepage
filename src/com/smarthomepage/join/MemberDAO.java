package com.smarthomepage.join;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.smarthomepage.util.DBmanager;

public class MemberDAO {
	Connection conn; // 자바에서 멤버필드의 멤버변수는 초기화
	Statement stmt; // 하지 않아도 된다.단 지역변수라면
	ResultSet rs;   // 초기화 해야 한다.
	PreparedStatement pstmt;
	// 생성자를 싱글톤 패턴으로 생성한다.
	// private 으로 생성자를 바꾸면
	// new MemberDAO() 가 작동하지 않는다.
	// 이유는 인스턴스를 하나만 만들기 위함이다.
	private MemberDAO() {
		conn = DBmanager.getConnection();
	}
	private static MemberDAO instance = new MemberDAO();
	public static MemberDAO getInstance(){
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
	public int insertMember(MemberBean bean){
		int num=0;
		System.out.println("DAO 에 넘어온 값 :" + bean.getId());
		System.out.println("DAO 에 넘어온 값 :" + bean.getPwd());
		System.out.println("DAO 에 넘어온 값 :" + bean.getAge());
		System.out.println("DAO 에 넘어온 값 :" + bean.getName());
		System.out.println("DAO 에 넘어온 값 :" + bean.getGender());
		String sql = "insert into member(id,pwd,name,age,gender) values( ? , ? , ? , ? , ? )";
		try{
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, bean.getId());
			pstmt.setString(2, bean.getPwd());
			pstmt.setString(3, bean.getName());
			pstmt.setString(4, bean.getAge());
			pstmt.setString(5, bean.getGender());
			num = pstmt.executeUpdate();
		}catch(Exception ex){
			ex.printStackTrace();
			System.out.println("MemberDAO 에서 에러가 발생 !!");
		}
		return num;
		
	}
	
}








