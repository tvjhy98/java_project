package com.ict12.after;

public class Ex04 {
	public static void main(String[] args) {
		double avg = 50;
		String res = "�ʱⰪ";
		if (avg>=60) {
			res="�հ�";
		}
		if(avg<60) {
			res = "���հ�";
		}
		System.out.println(res);
		System.out.println("===========");
		
		String res2 = "����";
		if(avg>=60) {
			res2="�հ�";
		}
		System.out.println(res2);
		System.out.println("========");
		
		int k1 = 47;
		String res3 = "Ȧ��";
		if(k1%2==0) {
			res3="¦��";
		}
	}
	
}
