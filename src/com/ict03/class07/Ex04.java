package com.ict03.class07;

// 1. Member ����Ŭ����
public class Ex04 {
	String name = "ȫ�浿";
	private static int age = 24 ; 
	static String addr = "���ֵ�";
	
	public Ex04() {
		System.out.println("�ܺ�Ŭ���� ������ : " + this);
	}
	public void sound  () {
		int money = 1000;
		final int time =2 ;
//		static int number = 12 ;
//		static final int number2 = 12;
		System.out.println("�ܺ�Ŭ���� �޼ҵ� : " + name + ", money : " + money);
	}
	
	public static class Inner01 {
		String name = "ȫ����";
		final int i2 = 10;
		// ���� Ŭ���������� static ��� ����
		// ������ static�� ����ϰ��� �Ϸ��� ���� Ŭ�������� static�� ������
		// static int i3 = 20;
		static final int i4 = 30;
		
		public  Inner01() {
			System.out.println("����Ŭ���� ������ : " + this);
		}
		// ���� Ŭ������ �ܺ�Ŭ������ �޼ҵ�� �ʵ带 ������� ��밡��
		// ���� Ŭ���� �޼ҵ�
		public void play () {
			int money = 10000;
			System.out.println("�̸� : " + name);
			System.out.println("�ݾ� : " + money);
			// �ܺ�Ŭ������ �ʵ� ��� static�ٿ��� ��밡��
			System.out.println("���� : " + age);
			// �ܺ�Ŭ���� �޼ҵ�
			//sound();
			
		}
		
		
	}
	
	
	
}
