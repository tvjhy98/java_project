package com.ict09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex02 {
	public static void main(String[] args) {
		// jdbc �� �ʿ��� 3�� Ŭ���� ����
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null; // select���� ���
		int result = 0;  // select���� �ƴҰ�� 
		try {
			//1. ����̹�
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// ������ ���� ���� (3��)
			String url = "jdbc:mysql://localhost/test01db?characterEncoding=utf-8&serverTimezone=UTC";
			String user = "test01";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			// 3. ������ �ۼ�
			String sql = "insert into customer(custid, name, address, phone)"
							+" values(7,'�����','���� ����','000-9000-0001')";
			//4. ���� db�� ���� �غ�
			stmt = conn.createStatement();
			
			// 5. ���� ������ ��� �ޱ�
			// �̶� ����� �ΰ����� (select���� select���� �ƴѰ�(insert, update, delete) )
			// select���� ��� 
			// rs=stmt.executeQuery(sql);
			
			result = stmt.executeUpdate(sql);
			
			// System.out.println(result);
			if(result>0) {
				System.out.println("���� ����");
				
				sql = "select*from customer";
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				while(rs.next())
					System.out.println(rs.getInt("custid")+"\t");
				 	System.out.println(rs.getString("name")+"\t");
				 	System.out.println(rs.getString("address")+"\t");
				
			}else {
				System.out.println("���� ���� 1");
			}
			
			
		} catch (Exception e) {
			System.out.println("���� ���� 2");
		}finally {
			try {
				
			} catch (Exception e2) {
			}
		}
	}
}
