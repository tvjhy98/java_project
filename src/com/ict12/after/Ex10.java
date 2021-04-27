package com.ict12.after;

public class Ex10 {
	public static void main(String[] args) {
		// while문 : for문과 같은 반복문
		// 형식1)
		//		초기식;
		//		while( 조건식){
		//				조건식이 참일때 실행할 문장;
		//				증감식;
		//		}
		//  while문 끝을 만나면 조건식으로 가자 
		
		// 1 -10까지
		int i = 1;
		while(i<11) {
			System.out.println(i);
			i++;
		}
		
		System.out.println();
		
		//1-10 짝수
		int j = 1;
		while (j<11) {
			if(j%2==0) {
				System.out.println(j);
			}
			j++;
		}
		
		// 형식2)
		// 초기식
		// while(true){
		//	** if(빠져나갈 조건식) break;(먼저 탈출)
		// 	실행할 문장;
		//	** if(빠져나갈 조건식) break;(나중 탈출)
		// 증감식;
		// }
		
		// 1-10 까지 출력하자 
		int s1 = 1;
		while(true) {
			if(s1>=11) break;
			System.out.println(s1);
			s1++;
		}
		System.out.println();
		
		int s2 = 1;
		while(true) {
			System.out.println(s2);
			if(s2>=11) break;
			s2++;
		}
		System.out.println("=========");
		
		
		//1-10 짝수
		int s3 = 1;
		while (true) {
			if(s3>=11)break;
			if(s3%2==0) {
				System.out.println(s3);
				
			}
			s3++;
		}
		
		
		
		
		
		
		
		
	}
}




