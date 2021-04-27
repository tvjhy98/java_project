package com.ict12.after;

import java.util.Iterator;

public class Ex08 {
	public static void main(String[] args) {
		// for문 : 정해진 규칙에 따라 실행문응 반복처리 하는문 
		// 	형식) : for(초기식; 조건식;증감식{
		//			조건식이 참일때 실행할 문장;
		//			조건식이 참일때 실행할 문장;
		//			}
		
		// for문 만나면 무조건 초기식부터 시작한다 
		// 조건식이 참일때 실행, 조건식이 거짓이면 for문을 빠져나간다
		//	for문의 끝을 만나면 무조건 증감식으로 가서 증감하고 바로 조건식으로 간다
		
		// 1-10출력
		
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}
		
		// 1-10 짝수만
		for (int i = 1; i < 11; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
		// 21 -40 홀수
		for (int i = 21; i < 41; i++) {
			if (i%2==1) {
				System.out.println(i);
			}
		}
		// 5단 출력
		for (int i = 1; i < 10; i++) {
			System.out.println("5 *" + i + "="+(5*i));
		}
		
		
		//  0 0 0 0
		//  0 0 0 0
		//  0 0 0 0
		//  0 0 0 0
		for (int i = 1; i < 5; i++) {
			System.out.println("0000");						
		}		
		
		System.out.println("============");
		// 다른방법
		
		for (int i = 1; i < 17; i++) {
			System.out.print("0 ");
			if (i%4==0) { // 4의 배수일때 줄바꿈
				System.out.println();
			}
		}
		
		
		
	}
}
