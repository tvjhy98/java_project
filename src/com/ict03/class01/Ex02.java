package com.ict03.class01;

public class Ex02 {
	// Ŭ���� �ȿ��� 3������ �����Ѵ�
	// ����ʵ�� , ����޼ҵ�, ������
	
	//	����ʵ� : ����� ����, static �� instance�γ�������
	// final �����ϸ� ���
	// static ������ �ν��Ͻ� (��ü �����ҋ� ���� ���������)
	// static �̶� ��ü ������ ��� ���� �̸� ���������
	int k1= 80;						//�ν��Ͻ� ���� == �Ϲݺ���
	static int k2 = 90;				// static���� 
	final int k3 = 85;				// �ν��Ͻ� ���
	static final int K4 = 95;		// static ��� = API���� �����ϴ� �������
	
	
	// ����޼ҵ� : ����, ���
	// �޼ҵ�� �ڱ⸦ ȣ���Ѱ����� �ǵ��ư���
	// �ν��Ͻ�, ��ȯ���� ���� (���� �����Ͱ� ����)
	public void prn01() {
		// �� �����Ҽ� �����Ƿ� ����
		k1 = k1 + 20 ; 
		k2 = k2 + 10 ;
		System.out.println("k1 = " + k1);
		System.out.println("k2 = " + k2);
			
		// final�� ������ ����̴� ����� �� ������ �Ҽ� ����  // �����߻�
		// K3 = K3 + 15 ;
		// K4 = K4 + 5  ;
		
		// �������� : �޼ҵ� �ȿ��� ������� ����
		// 			�޼ҵ� �ȿ��� ������� ������ �޼ҵ带 ȣ���Ҷ� �����ȴ�
		// 			�޼ҵ� ������ ������� 
		// 			���������� static�� ����� ���� 
		
		int s1 = 10 ;
		// static int s2 = 90 ;
		final int s3 = 85 ;
		// static final int s4 = 95 ;
		
	}
	// static, ��ȯ���� ����
	public static void prn02() {
		// static �޼ҵ忡�� �ν��Ͻ� ������ ����Ҽ� ����
		// k1 = k1 + 20 ; 
		k2 = k2 + 10 ;
		// K3 = K3 + 15 ;
		System.out.println("k2= " + k2);
		System.out.println("K4= " + K4);
		
		// ���������� static�� ����� ����
		int s1 = 10 ;
		//static int s2 = 90 ;
		final int s3 = 85 ;
		//static final int s4 = 95 ;
		
	}
	// �ν��Ͻ�, ��ȯ�� ����, ������ �� return '���� ������'
	public int prn03() {
		return 'c';	  // ��ȯ������ ���� �ڷ���
		// return 14; // ��ȯ���̶� ���� �ڷ���
	}
	// static, ��ȯ�� ����
	public static double  prn04() {
		return 147;
		// return 3.14;;
	}
	
}
