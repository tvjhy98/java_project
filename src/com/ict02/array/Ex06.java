package com.ict02.array;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String [] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		int[] sum = new int[5];
		double[] avg = new double[5];
		String[] hak = new String[5];
		int[] rank = new int[5];

		//  �Է�
		for (int i = 0; i < rank.length; i++) {
			System.out.println("�̸� :");
			name [i] = scan.next();
			System.out.println("���� :");
			kor [i] = scan.nextInt();
			System.out.println("���� :");
			eng [i] = scan.nextInt();
			System.out.println("���� :");
			math [i] = scan.nextInt();
			
			// ���� : ó�� // ���� ��� ����( �Ҽ� ����)
		}
		
		// ���� : ó�� // ���� ��� ����
		for (int i = 0; i < rank.length; i++) {
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = (int)(sum[i]/3.0*10)/10.0;
			if (avg[i]>= 90) {
				hak[i] = "A";
			}else if (avg[i]>=80){
				hak[i] = "B";
			}else if(avg[i]>=70){
				hak[i] = "C";
			}else {
				hak[i] ="F";
			}
		}
		// ���� : ó�� //����
		for (int i = 0; i < hak.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if(sum[i] < sum[j]) {
					rank [i]++;
				}
			}
		}
		
		System.out.println("�� ��\t�� ��\t�� ��\t�� ��\t�� �� ");
		// ���
		for (int i = 0; i < rank.length; i++) {
			System.out.print(name[i] +"\t");
			System.out.print(sum[i] +"\t");
			System.out.print(avg[i] +"\t");
			System.out.print(hak[i] +"\t");
			System.out.println(rank[i]);
		}
		
		
			
			
		
		
		
	}
}
