package com.ict12.after;

import java.util.Iterator;

public class Ex08 {
	public static void main(String[] args) {
		// for�� : ������ ��Ģ�� ���� ���๮�� �ݺ�ó�� �ϴ¹� 
		// 	����) : for(�ʱ��; ���ǽ�;������{
		//			���ǽ��� ���϶� ������ ����;
		//			���ǽ��� ���϶� ������ ����;
		//			}
		
		// for�� ������ ������ �ʱ�ĺ��� �����Ѵ� 
		// ���ǽ��� ���϶� ����, ���ǽ��� �����̸� for���� ����������
		//	for���� ���� ������ ������ ���������� ���� �����ϰ� �ٷ� ���ǽ����� ����
		
		// 1-10���
		
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}
		
		// 1-10 ¦����
		for (int i = 1; i < 11; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
		// 21 -40 Ȧ��
		for (int i = 21; i < 41; i++) {
			if (i%2==1) {
				System.out.println(i);
			}
		}
		// 5�� ���
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
		// �ٸ����
		
		for (int i = 1; i < 17; i++) {
			System.out.print("0 ");
			if (i%4==0) { // 4�� ����϶� �ٹٲ�
				System.out.println();
			}
		}
		
		
		
	}
}
