package com.ict12.after;

public class Ex12 {
	public static void main(String[] args) {
		// break�� : ����ݺ����� Ż���Ҷ� ���
		// continue �� : continue�� ������ ���๮�� �����ϰ� ���� ȸ���� ����
		//				for���� ���� ������, while�� �϶��� ������� ����
		
		
		
		//	 1-10 ���� ����Ҷ� i�� 4�϶� break;
		for (int i = 1; i < 11; i++) {
			if(i==4) break;
			System.out.println(i);
		}
		System.out.println("=============");
			
		//  1-10 ���� ����Ҷ� i�� 4�϶� continue;
		for (int i = 1; i < 11; i++) {
			if(i==4) continue;
			System.out.println(i);
		}
		
		System.out.println("=============");
		
		// ���� for������ break , continue ���
		// j�� 3�϶� break, continue
		for (int i = 1; i <4; i++) {
			for (int j = 1; j < 6; j++) {
				if(j==3) continue;
				System.out.println("i =" + i + ", j = "+ j);
			}
		}
		System.out.println("================");
		
		
		
		
	}
}
