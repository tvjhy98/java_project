package com.ict04.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// ���� catch�� : try���� ���� �߻��� ���� ������ ���ܰ� �߻��� ��� ���
		// ���� ���� : Exception�� ����ҋ��� �ݵ�� �Ʒ��� catch������ ����Ѵ�
		
		Scanner scan = new Scanner(System.in);
		/*
		try {
		
		}catch (InputMismatchException e) {
			System.out.println("������ �Է��ϼ���");
			
		} catch (ArithmeticException e) {
			System.out.println("0 ���δ� ���ڸ� ������ �����ϴ�");
		}
		*/
		
		try {
			int var = 3 ;
			System.out.print("���� �Է� : ");
			int su = scan.nextInt();
			System.out.println("���� : " + (su/var));
			
		} catch (Exception e) {
			System.out.println("����� �Է��ϼ��� : " + e);
		}
		
		
		System.out.println("�����ϼ̽��ϴ�");
		
	}
}
