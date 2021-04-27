package com.ict12.after;

public class Ex07 {
	public static void main(String[] args) {
		// switch ~case : if문과 같은 분기문
		// if문에 사용하는 조건식은 boolean, 비교연산, 논리연산
		// Switch문은 byte,short, int , char, String 일때만 사용가능
		// ** 범위가 나오면 if문이 편하다 
		// 형식		switch (인자값){
		//			case 조건값1 : 인자값에서 요구한 값이 조건값1일때 실행할문장 ; break;
		//			case 조건값2 : 인자값에서 요구한 값이 조건값1일때 실행할문장 ; break;
		//			case 조건값3 : 인자값에서 요구한 값이 조건값1일때 실행할문장 ; break;
		// 			default   	 : 조건값1,2,3 모두 아닌경우 즉 나머지일때 
		//			}
		//	** 주의사항 : break 문이 없으면 다음 break를 만날때까지도 모든 문장을 실행한다
		//				break문은 빠져나가는 역할을 한다
		
		// int k1이 1또는 3이면 남자, 2또는 4는 여자 나머지는 외국인
		int k1 = 4;
		String res = "";	
		switch (k1) {
		case 1: res = "남자"; break;
		case 3: res = "남자"; break;
		case 2: res = "여자"; break;
		case 4: res = "여자"; break;	
		default: res ="외국인";
			break;
		}
		System.out.println(res);
		
		switch (k1) {
		case 1: 
		case 3: res = "남자"; break;
		case 2:
		case 4: res = "여자"; break;	
		default: res ="외국인";
			break;
		}
		
		System.out.println(res);
		
	}
}
