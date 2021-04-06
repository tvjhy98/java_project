package com.ict05.collection;

import java.util.HashMap;
import java.util.Iterator;

public class Ex08 {
	public static void main(String[] args) {
		// Map �������̽� : Key �� Value�� �����ϴ� ������ �̷����
		// 					Key�� �ߺ��ɼ� ���� (key�� �ߺ��Ǹ� ����� �ȴ�)
		//					value�� �ߺ�����
		// 					key�� ȣ���ϸ� value�� ���´�
		//					key�� set�÷��ǿ� ������ ���� => keySet()
		
		// �ֿ�޼ҵ�
		// add()�� �߰�, ���� �ȵ�
		// - put(K key, V value) : �߰�, ����
		// - keySet() : key�� set���� ����
		// - containsKey(Object key) : boolean
		// 		���ڷ� ���� key�� �����ϸ� true, �ƴϸ� false
		// - containsValue(object value) : boolean
		// 		���ڷ� ���� value�� �����ϸ� true �ƴϸ� false
		// - get(Object key) : Ű�� �޾Ƽ� value�� �����Ѵ�
		// remove(object key) : Ű�� �޾Ƽ� 
		// - replace(K key, V value) : ġȯ�ϱ�
		
		// 1. key�� ���� �ִ� ���ڷ� ����� for�� ��밡��
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();		
		map1.put(1, "�ѱ�");
		map1.put(2, "�̱�");
		map1.put(3, "�߱�");
		map1.put(4, "����");
		map1.put(5, "�±�");
		System.out.println(map1);
		
		map1.put(3, "�Ϻ�"); // key�� �ߺ�(�����)
		System.out.println(map1);
		
		map1.put(6, "�ѱ�"); // value�� �ߺ� (��� ����)
		System.out.println(map1);
		
		// �ϳ��� ����(get(key))
		System.out.println(map1.get(1));
		System.out.println(map1.get(2));
		System.out.println(map1.get(3));
		System.out.println(map1.get(4));
		System.out.println(map1.get(5));
		System.out.println();
		
		for (int i = 1; i < map1.size(); i++) {
			System.out.println(map1.get(i));
		}
		System.out.println();
		
		// ������ for�� ����ҷ��� => keySet() ���
		for (Integer k : map1.keySet()) {
			System.out.println(map1.get(k));
			
		}
		// iterator�� ��� => keySet() ���
		Iterator<Integer> it = map1.keySet().iterator();
		while (it.hasNext()) {
			int s1 = (int)it.next();
			System.out.println(map1.get(s1));
		}		 
		System.out.println("====================");
		
		// 2. key�� ���ڷ� ����� ��½� keySet() �� ����ؾ� �ȴ� (�Ϲ���)
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("�̸�", "��浿");
		map2.put("����", "34");
		map2.put("�ּ�", "������");
		map2.put("����", "��");
		map2.put("���", "���ڱ�");
		
		System.out.println(map2.get("�̸�"));
		System.out.println(map2.get("����"));
		System.out.println(map2.get("�ּ�"));
		System.out.println(map2.get("����"));
		System.out.println(map2.get("���"));
		System.out.println();
		
		// ������ for��
		for (String k : map2.keySet()) {
			System.out.println(map2.get(k));
		}
		
		// Iterator 
		Iterator<String> it2 =map2.keySet().iterator();
		while (it2.hasNext()) {
			String k = (String) it2.next();
			System.out.println(map2.get(k));
			
			
		}
		
		
		
		
	}
}
