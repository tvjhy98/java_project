package com.ict12.after;

public class Ex01 {
	// 메인메소드 : JVM이 메인메소드를 호출한다
	//				자바 프로그램을 시작하기 위해서 메인메소드로 호출 (스타팅 포인트)
	public static void main(String[] args) {
		// 자료형 (데이터 타입) : 자바에서 자료를 분류하고 처리하는 형태 
		// 1. 기본자료형 : 컴파일러에서 처리되는 자료형 
		//					boolean,char, byte, short, int,long,float,double	
		// 2. 참조자료형 : 클래스를 자료형으로 사용 
		// 					가장 대표적인것이 String이다 
		
		// 		boolean : 논리형	=> true 또는 false만 저장
				boolean b1 = true;
				boolean b2 = false;
				
		// 		char : 한 글자만 저장 (저장될때 숫자로 저장)
		//				반드시 홑따옴표 사용
		// 				숫자로 저장되기 때문에 연산 가능
		//				숫자로 저장되지면 호출하면 다시 문자로 나온다
			char c1 = 'a'; // c1 에 a의 숫자 97이 저장(숫자값)
			char c2 = 97;	// c2에 97이 저장된다 
			System.out.println(c1);	// a 호출하면 다시 문자로 나온다
			System.out.println(c2);	// a 호출하면 다시 문자로 나온다
			
		// 정수형 숫자 : byte < short < int < long
		// 정수형 숫자의 기본 자료형은 int 이다 
		// 주의사항 => byte 와 short를 연산하면 int 이상
		
		// byte : -128 127,
		// short : -32768 ~32767
		// int 와 long 은 범위를 외울 필요가 없다 
		// 앞으로 일반적인 정수는 int이다 
		// long은 숫자뒤에 L또는 l을 붙인다 (생략가능)
		int s1 = 12;
		long s2 = 12l ;
		long s3 = 12 ;
		
		// int s4 = 12L; 오류발생
		
		// 실수형 : float, double 
		// 실수형의 기본 자료형은 double 이다 .
		// float는 숫자뒤에 F or f 를 붙인다 (생략하면 오류)
		
		// float k1 = 12.4; 오류발생
		float k2 = 12.4f;
		
		double k3  = 12.4 ;
		double k4 = 12.4f;
		
		// ** 숫자는 작은 자료형에서 큰자료형으로 저장되는것은 오류안남 (promotion, 자동형변환)
		// 		반대로 큰 자료형에서 작은 자료형으로 저장될때는 오류발생 
		// 		이렇게 오류가 발생하면 강제로 형변환을 해서 오류를 없애다 (디모션, 강제형변환)
		// 		기준: char < int < long < float < double 
		
		// 강제 형 변환은 왼쪽 자료형을 기준으로 만든다 
		
		int s4 = (int) 12L; 
		float k1 = (float)12.4; 
	
		
		// 참조자료형 : 클래스를 자료형으로 만드는것
		// 				가장 대표적인 자료형이 String 
		
		String str1 = "대한민국";
		
		// String 자료형에서 + 연산 :
		//		-,*,/ 연산은 없다.
		//		실제로 더하기 하는 연산자는 아니고 
		// 		문자열과 문장열을 연결하는 연산자이다 	
		//		문자열에 + 연산을 하면 무조건 문자열이 된다
		
		 
		String str2 = "1000";
		int s5 = 1000;
		System.out.println(str2 +1000); // 연결
		System.out.println(s5 +1000);	// 실제 더하기 
		
		
		
		
				
	}
}











