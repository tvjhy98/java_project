package com.ict09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex01 {
	public static void main(String[] args) {
	// JDBC (JAVA DATABASE Connectivity) 는 자바에서 데이터 베이스를 접속할수 있도록 하는 자바 API이다 
	// JDBC 는 데이터베이스에서 자료를 쿼리하거나 업데이트 하는 방법을 제공한다 
	// 각 데이터베이스들에게 접속할수 있는 JDBC 드라이버가 필요하다
	// MYSQL에 필요한 드라이버를 다운받아서 해당 프로젝트에 참조해야 된다
	// 프로젝트에서 마우스 오른쪽 - build path - 
	// configure Build path - add External jars ..해당 라이브러리 선택	
	
		
		// DB 처리에 필요한 클래스 3개 선언
		Connection conn = null;
		Statement stmt = null;  // select문의 결과를 받는다
		ResultSet rs = null;   // insert update delete의 결과
		int result = 0;
		
		try {
			// 1. 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. 접속을 위한 정보 3개
			// 계정생성시 localhost로 만들면 //localhost 사용
			String url = "jdbc:mysql://localhost/test01db?characterEncoding=UTF-8&serverTimezone=UTC";
			String user = "test01";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			// 3. 퀄리문 작성 (CRUD = 조작어 (insert, update, delete select)
			String sql = "select*from customer";
			
			// 4. 실제 DB에 접속 가지고 statement 클래스에 저장
			stmt =  conn.createStatement();
			
			// 5. statement 클래스에 쿼리 저장 후 
			// DB에 결과 받아서 처리한다
			// 이때 두가지로 나눠진다 select문일떄와 아닐때로 나눠진다
			
			// select문일때는 ResultSet 클래스가 받는다 
			rs = stmt.executeQuery(sql);
			
			// slect문이 아닌 경우(insert, update, select) int가 받는다 
			// result = stmt.executeUpdate(sql);
			
			// 6. 결과 보기
			// .next() => 다음줄에 정보가 있으면 true
			while (rs.next()) {
				System.out.print(rs.getInt("custid")+"\t");
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getString("address")+"\t");
				System.out.println(rs.getString("phone"));
			}
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
		
	}
}
