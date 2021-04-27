package com.ict09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex03 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0 ;
		
		try {
			// 1. ����̺� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. ���� ����
			String url = "jdbc:mysql://localhost/test01db?characterEncoding=utf-8&serverTimezone=UTC";
			String user = "test01";
			String passworld = "1111";
			conn = DriverManager.getConnection(url, user, passworld);
			
			String sql = "update customer set name = '����ȣ', address = '���ѹα� ����' where custid = 7 ";
			
			// 4. ���� DB �� ���� �غ�
			stmt = conn.createStatement();
			
			// 5. ���� ������ ��� �ޱ�
			//   select���̸� = > rs.stmt.excuteQuery(sql);
			
			// select���� �ƴϸ�
			result = stmt.executeUpdate(sql);
			
			// System.out.println(result);
			if (result>0) {
				System.out.println("���� ����");
				
				sql = "select*from customer";
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				while(rs.next()) {
					System.out.print(rs.getInt("custid")+"\t");
					System.out.print(rs.getString("name")+"\t");
					System.out.print(rs.getString("address")+"\t");
					System.out.println(rs.getString("phone"));
				}
					
			}else {
				System.out.println("���� ���� 1");
			}
			
			
			
		} catch (Exception e) {
			System.out.println("���� ���� 2");
		}finally {
			try {
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
