package com.ict12.after;

public class Ex04 {
	public static void main(String[] args) {
		double avg = 50;
		String res = "초기값";
		if (avg>=60) {
			res="합격";
		}
		if(avg<60) {
			res = "불합격";
		}
		System.out.println(res);
		System.out.println("===========");
		
		String res2 = "불합";
		if(avg>=60) {
			res2="합격";
		}
		System.out.println(res2);
		System.out.println("========");
		
		int k1 = 47;
		String res3 = "홀수";
		if(k1%2==0) {
			res3="짝수";
		}
	}
	
}
