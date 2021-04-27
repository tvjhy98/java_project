package com.ict09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex01 {
	public static void main(String[] args) {
	// JDBC (JAVA DATABASE Connectivity) �� �ڹٿ��� ������ ���̽��� �����Ҽ� �ֵ��� �ϴ� �ڹ� API�̴� 
	// JDBC �� �����ͺ��̽����� �ڷḦ �����ϰų� ������Ʈ �ϴ� ����� �����Ѵ� 
	// �� �����ͺ��̽��鿡�� �����Ҽ� �ִ� JDBC ����̹��� �ʿ��ϴ�
	// MYSQL�� �ʿ��� ����̹��� �ٿ�޾Ƽ� �ش� ������Ʈ�� �����ؾ� �ȴ�
	// ������Ʈ���� ���콺 ������ - build path - 
	// configure Build path - add External jars ..�ش� ���̺귯�� ����	
	
		
		// DB ó���� �ʿ��� Ŭ���� 3�� ����
		Connection conn = null;
		Statement stmt = null;  // select���� ����� �޴´�
		ResultSet rs = null;   // insert update delete�� ���
		int result = 0;
		
		try {
			// 1. ����̹� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. ������ ���� ���� 3��
			// ���������� localhost�� ����� //localhost ���
			String url = "jdbc:mysql://localhost/test01db?characterEncoding=UTF-8&serverTimezone=UTC";
			String user = "test01";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			// 3. ������ �ۼ� (CRUD = ���۾� (insert, update, delete select)
			String sql = "select*from customer";
			
			// 4. ���� DB�� ���� ������ statement Ŭ������ ����
			stmt =  conn.createStatement();
			
			// 5. statement Ŭ������ ���� ���� �� 
			// DB�� ��� �޾Ƽ� ó���Ѵ�
			// �̶� �ΰ����� �������� select���ϋ��� �ƴҶ��� ��������
			
			// select���϶��� ResultSet Ŭ������ �޴´� 
			rs = stmt.executeQuery(sql);
			
			// slect���� �ƴ� ���(insert, update, select) int�� �޴´� 
			// result = stmt.executeUpdate(sql);
			
			// 6. ��� ����
			// .next() => �����ٿ� ������ ������ true
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
