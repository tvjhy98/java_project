package com.ict12.after;

public class Ex09 {

	public static void main(String[] args) {
		// 다중 for문 : for문안에 for문이 존재
		for (int i = 1; i < 4; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.println("i= "+ i + ",j="+j);
			}
		}
		
		// 구구단
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
		
		
		// 구구단 (같은단은 옆으로) 행으로
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i +"*"+j +"="+(i * j));
			}
			System.out.println();
		}
		
		System.out.println("=======");
		
		// 구구단 (같은단은 아래로) 열로
		for (int i = 1; i < 10; i++) {		
			for (int j = 2; j < 10; j++) {
				System.out.print(j +"*"+i +"="+(j * i));
			}
			System.out.println();
		}
		
		
		
		
		

	}

}
