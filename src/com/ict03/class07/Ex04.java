package com.ict03.class07;

// 1. Member 내부클래스
public class Ex04 {
	String name = "홍길동";
	private static int age = 24 ; 
	static String addr = "제주도";
	
	public Ex04() {
		System.out.println("외부클래스 생성자 : " + this);
	}
	public void sound  () {
		int money = 1000;
		final int time =2 ;
//		static int number = 12 ;
//		static final int number2 = 12;
		System.out.println("외부클래스 메소드 : " + name + ", money : " + money);
	}
	
	public static class Inner01 {
		String name = "홍일점";
		final int i2 = 10;
		// 내부 클래스에서는 static 사용 못함
		// 강제로 static를 사용하고자 하려면 내부 클래스에도 static을 붙이자
		// static int i3 = 20;
		static final int i4 = 30;
		
		public  Inner01() {
			System.out.println("내부클래스 생성자 : " + this);
		}
		// 내부 클래스는 외부클래스의 메소드와 필드를 마음대로 사용가능
		// 내부 클래스 메소드
		public void play () {
			int money = 10000;
			System.out.println("이름 : " + name);
			System.out.println("금액 : " + money);
			// 외부클래스의 필드 멤버 static붙여야 사용가능
			System.out.println("나이 : " + age);
			// 외부클래스 메소드
			//sound();
			
		}
		
		
	}
	
	
	
}
