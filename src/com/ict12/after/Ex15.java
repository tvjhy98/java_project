package com.ict12.after;

public class Ex15 {
	public static void main(String[] args) {
		// �迭 �����ϱ� 
		int[] su = {3,4,9,5,6,1,7,2,10,8};
		
		// �ڸ� ������ ���� �ӽú���
		int tmp = 0;
		
		// ������ ���� for��
		for (int i = 0; i < su.length-1; i++) {
			for (int j = i+1; j < su.length; j++) {
				// ��(i)���� ��(j)�� ������ �ڸ� ���� (�������� (su[i] > su[j]))
				// ��(i)���� ��(j)�� ũ�� �ڸ� ���� (��������   (su[i] < su[j]))
				if(su[i] > su[j]) {
					tmp = su[j];
					su[j] = su[i];
					su[i] = tmp ;
				}
			}
		}
		
		// ���
		for (int i = 0; i < su.length; i++) {
			System.out.println(su[i]);
		}
		
	}
}
