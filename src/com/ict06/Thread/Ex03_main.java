package com.ict06.Thread;

public class Ex03_main {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Ex03 t1 = new Ex03();
		t1.go();
		System.out.println("�����ϼ̽��ϴ�");
		System.out.println("===============");
		
		// ������ ó���ϱ� ���ؼ� start()�� ȣ���ߴ�
		// run() ���� ���������� start()�� �־ start()�ΰ���
		// �̰��� ������ ó���� �ƴϴ�
		// start() => run()�� ���� �ȴ�
		// �̰��� ������ ó���ߴٰ� �Ѵ�
		System.out.println(Thread.currentThread().getName());
		t1.start();
		System.out.println("�����ϼ̽��ϴ�");
		System.out.println("==============");
		
		
	}
}
