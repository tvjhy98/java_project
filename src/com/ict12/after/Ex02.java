package com.ict12.after;

public class Ex02 {
	public static void main(String[] args) {
		// 산술 연산자 : +, -, *, /, %
		// 작은 자료형과 큰 자료형을 연산하면 큰자료형이 된다 
		
		// 소수점 첫째자리 구하기 
		double d1 = 24.6843; // 24.6
		int d2 = (int)(d1 * 10) ; // d1이 double 이므로 d1 * 10 은 double 이다 
		System.out.println(d2); // 246;
		
		double d3 = d2/10 ;	// d2가 int 이므로 d2/10 은 int이다
		System.out.println(d3); //24.0
		
		double d4 = d2/10.0;	// d2가 int 이므로 d2/10.0 은 double이다
		System.out.println(d4); 	// 24.6
		
		// 한번에 쓰기
		double d5 = (int)(d1*10)/10.0;
		System.out.println(d5);
		
		// 원단위 절삭
		
		int d6 =12579; // 12570
		int d7 = d6/10; // 1257
		int d8 = d7 * 10 ;  //12570
		
		// g한번에 쓰기
		int d9 = (d6 / 10)*10;
		
		// '/'의 결과를 int로 하면 몫
		// '%' 는 나눈 나머지를 말한다 
		
		int k1 = 7 ;
		int k2 = 3 ;
		int k3 = k1 / k2 ;	// 몫
		int k4 = k1 % k2 ;	// 나머지
		System.out.println(k3);
		System.out.println(k4);
		
		// 어떤 수를 2로 나눈 나머지는 0 또는 1 
		// 어떤수를 5로 나눈 나머지는 0,1,2,3,4 다섯가지만 존재
		
		//	어떤 수를 2로 나눈 나머지는 0 => 짝수
		//	 어떤 수를 2로 나눈 나머지는 1 => 홀수
		
		
		
		
		
		
		
		
		
	}
}
