package com.ict03.class06;

import java.util.Iterator;

enum Type2{
	// ������ ��Ű��
	// 1. �� ���� 
	WALK("��ŷȭ", 270),
	RUN("����ȭ", 275),
	TRACK("Ʈ��ŷȭ",265),
	HIK("����ŷȭ",260);
	
	// 2. ��������
	final private String name;
	final private int size;
	
	// 3. ������
	Type2(String name, int size){
		this.name = name;
		this.size = size;
	}
	// 4. getter/ setter

	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}
	
	
}

public class Ex03 {
	public static void main(String[] args) {
		Type2 [] arr = Type2.values();
		for (int i = 0; i < args.length; i++) {
			if(i==2) continue;
			System.out.println(arr[i].getName()+ " , " + arr[i].getSize());
		}
		System.out.println("==================");
		for (Type2 k : arr) {
			System.out.println(k.getName()+ ", " + k.getSize());
		}
		System.out.println("==================");
		
		// ������ for�� // foreach = forin => �迭�̳� ���߿� ��� �÷��ǿ��� �ַ� ���
		// ':' �� �ǹ� �迭�� ������ �ִ� ó������ ������ ���ʴ�� ������ ���Խ�Ű�� ����
		// ���ο��� ����� ������ �����Ű�� ����
		// �� �迭�� Ư���� ��Ҹ� ó���Ҽ� ����
		// for (Type2 ���κ�����������Һ��� : �迭) {
		// 
		// }
		
		String [] msg = {"java", "jsp","spring", "android"};
		for(String k : msg) {
			System.out.println(k);
		}
		
		
		
		
	}
}




