package com.ict12.after;

public class Ex13 {
	public static void main(String[] args) {
		// break label�� : ���̺��� ������ ��� Ż���Ҷ� ���
		// continue label�� : continue�� ������ ���๮�� �����ϰ� ���̺��� ������ �ݺ����� ���� ȸ���� ����
		//	�ܼ� for���϶��� break�� break label�� ���� ȿ���� break label�� ����� ������ ����
		// (continue���� ����)
		
		// break
		for (int i = 1; i < 100; i++) {
			if(i == 6) break;
			System.out.println(i);
		}
		System.out.println();
		
		esc: // ���̺�
		for (int i = 1; i < 100; i++) {
			if(i == 6) break esc;
			System.out.println(i);
		}
			System.out.println();
			
			
			
			esc1:
			for (int i = 1; i <4; i++) {
				for (int j = 1; j < 6; j++) {
					if(j==3) break esc1;
					System.out.println("i =" + i + ", j = "+ j);
				}
			}	
			System.out.println("==========");
			esc2:
				for (int i = 1; i <4; i++) {
					for (int j = 1; j < 6; j++) {
						if(j==3) continue esc2;
						System.out.println("i =" + i + ", j = "+ j);
					}
				}		
			
			
			
	}
}
