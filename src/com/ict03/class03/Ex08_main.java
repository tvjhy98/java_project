package com.ict03.class03;

public class Ex08_main {

	public static void main(String[] args) {
		// �Ϲ����� ��ü ���� 
		// Ŭ���� ���������� = new ������();
		
		Ex06_MP3 mp3 = new Ex06_MP3();
		mp3.call();
		
		System.out.println("������ : " + mp3.s_sms);
		
		mp3.sms();
		System.out.println("������ : " + mp3.s_sms);
		
		mp3.sound();
		System.out.println();
		
		Ex07_DCa dca = new Ex07_DCa();
		dca.call();
		
		System.out.println("������ : " + mp3.s_sms);
		
		dca.sms();
		System.out.println("������ : " + mp3.s_sms);
		
		dca.picture();
		
		System.out.println("===============================");
		
		// ��Ӱ��迡���� �θ�Ŭ������ ������ ���� �Ҽ� �ִ� 
		// �� �ڽ� Ŭ������ �޼ҵ带 ����Ҽ� ���� 
		// p1�� Ex06_MP3Ŭ������ ���� �޼ҵ��� sound()�� �����Ҽ� ����
		
		Ex05 p1 = new Ex06_MP3();
		p1.call();
		p1.sms();
		System.out.println(p1.s_sms);
		// p1.sound();  �����߻�
		
		
		

	}

}






