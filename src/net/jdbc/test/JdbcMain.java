package net.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcMain {
	public static void main(String[] args) {
		Connection conn = null;
		try{
			// 드라이버 파일에 있는 클래스를 불러온다.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			/*
			 * @ 앞부분은  DB 마다 다르다.
			 * 이 코드에서는 localhost 는 IP 주소
			 * 1512 는 포트번호
			 * xe 는 SID 를 의미한다.
			 * */
			String driver = "jdbc:oracle:thin:@localhost:1521/xe";
			/*계정이름*/
			String userId = "system";
			/*계정비번*/
			String password = "oracle";
			/*Connection 초기화*/
			conn =  DriverManager.getConnection(driver,userId,password); 
			System.out.println("성공적으로 연결이 되었습니다.");
		}catch(Exception ex){
			ex.printStackTrace();
			System.out.println("JDBC 에러가 발생했습니다.");
		}
	}
}
