package com.ict12.after;

public class Ex09 {

	public static void main(String[] args) {
		// ���� for�� : for���ȿ� for���� ����
		for (int i = 1; i < 4; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.println("i= "+ i + ",j="+j);
			}
		}
		
		// ������
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
		
		
		// ������ (�������� ������) ������
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i +"*"+j +"="+(i * j));
			}
			System.out.println();
		}
		
		System.out.println("=======");
		
		// ������ (�������� �Ʒ���) ����
		for (int i = 1; i < 10; i++) {		
			for (int j = 2; j < 10; j++) {
				System.out.print(j +"*"+i +"="+(j * i));
			}
			System.out.println();
		}
		
		
		
		
		

	}

}
