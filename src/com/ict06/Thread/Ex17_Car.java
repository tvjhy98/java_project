package com.ict06.Thread;

import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class Ex17_Car {
	private List<String> carList = null;
	public Ex17_Car() {
		carList = new ArrayList<String>();
		
	}
	public String getCar() {
		String carName = null;
		switch ((int)(Math.random()*3)){
			case 0 : carName = "SM5"; break;
			case 1 : carName = "�ű׳ʽ�"; break;
			case 2 : carName = "ī����"; break;
			
		}
		return carName;
		
	}
	// �Һ��ڰ� �ڵ����� ��� �޼ҵ�
	public synchronized String pop() {
		String carName=null;
		if(carList.size()==0) {
			try {
				System.out.println("���� ����� �����Ҷ� ����" + "��ٸ�����");
				this.wait();
				
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// ��� �������� carList���� ���� ���߿� �� ���� �Ǹ�(����)
		carName = (String)carList.remove(carList.size()-1);
		System.out.println("�մ��� ���� �簬���ϴ�.." + "�մ��� ������ �� �̸���=>\" " + carName+"\"");
		return carName;
		
	}
	// �ڵ����� carList�� �ֱ�
	// â�� �ڵ����� 5�밡 �Ǹ� �Һ��ڵ鿡�� �ǸŸ� �����Ѵ�.
	public synchronized void push(String car) {
		carList.add(car);
		System.out.println("���� ����������ϴ�" + "�� �̸���\" "+car+"\"");
		if(carList.size()==5) {
			// ��� 0�϶� ����Ų ������� �غ��Ų��
			this.notify();
		}
	}
	
	
}








