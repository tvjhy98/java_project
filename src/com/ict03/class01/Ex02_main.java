package com.ict03.class01;

public class Ex02_main {
	public static void main(String[] args) {
		
		// static�� ��ü ������ ��� ���� �̸� ���������
		// ȣ���� Ŭ�����̸�.�޼ҵ�, Ŭ�����̸�.����
			
		// System.out.println(Ex02.k1);  //�ν��Ͻ�
		System.out.println(Ex02.k2);
		// System.out.println(Ex02.k3);	 // �ν��Ͻ�
		System.out.println(Ex02.K4);
		
		// ��ȯ���� ���� ���� ��� �޶����� 
		// void�� ������ �Ѿ���� �ʴ´� 
		Ex02.prn02();
		
		// void�� �ƴϸ� �ݵ�� ��ȯ���� ���缭 �������� 
		double su1 = Ex02.prn04();
		System.out.println(su1);
		
		System.out.println("=====��ü ���� ����======");
			
			
			
		// 1. Ex02 Ŭ������ ����ϱ� ���ؼ� Ŭ������ ��ü�� ������    
		// 	Ex02Ŭ������ �����ڰ� �������� �����Ƿ� �⺻ �����ڷ� ��ü ����
		// 	�⺻ �����ڶ� �μ� = �Ű������� ���� ������ ('Ŭ�����̸�()')
		//  Ŭ���� �������� = new ������ ;
		   Ex02 test = new Ex02();
		   
		   // �ּ�
		   System.out.println(test);
		   System.out.println(test.k1);
		   System.out.println(test.k2);
		   System.out.println(test.k3);
		   System.out.println(test.K4);
		   
		   // �޼ҵ� ����
		   test.prn01();
		   test.prn01();
		   Ex02.prn02();
		   int su2 = test.prn03();
		   System.out.println(su2);
		   
		   double su3 = test.prn04();
		   System.out.println(su3);
		   
		   double su4 = Ex02.prn04();
		   System.out.println(su4);
		   
		
	}
}
