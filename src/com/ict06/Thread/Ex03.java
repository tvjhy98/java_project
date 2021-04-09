package com.ict06.Thread;

// ������ start() => run() �̵��ؾ� ������ ó���� ��
//			start() => run() ������ �ƴ�
//			run() => run() ������ �ƴ�

// ������ ������ Thread Ŭ������ ��� Runnable �������̽��� ���
// ������ Ŭ������ start(), run() ��� ������ �ִ�
// Runnable �������̽��� run()�� ������ �ִ�
public class Ex03 extends Thread {
	public void go() {
		for (int i = 1; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
			
		}
	}
	 
	public void start() {
		for (int i = 11; i < 20; i++) {
			System.out.println(Thread.currentThread().getName());
			
		}
	}
	
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
			
		}
	}
	
	
}
