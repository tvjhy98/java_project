package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex25_Input {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String pathname = "c:"+File.separator+"study"+File.separator+
								"util"+File.separator+"ict09.ser";
		
		File file = new File(pathname);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			ArrayList<Ex25_VO> list = (ArrayList<Ex25_VO>)ois.readObject();
			
//			System.out.println("�̸�\t����\t���\t����");
//			for (Ex25_VO k : list) {
//				System.out.println(k.getName()+"\t");
//				System.out.println(k.getSum()+"\t");
//				System.out.println(k.getAvg()+"\t");
//				System.out.println(k.getHak());
//			}
			
			
			// ����
			// �÷����� �迭�� ����
			Ex25_VO[] arr = (Ex25_VO[]) list.toArray(new Ex25_VO[0]);
			Ex25_VO tmp = new Ex25_VO(); 
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if(arr[i].getSum() < arr[j].getSum()) {
						tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				}
			}
			
			// ���� -> ����(?)
			// �÷����� �迭�� �����ؼ� ���� 
			
			System.out.println("�̸�\t����\t���\t����");
			for (Ex25_VO k : arr) {
				System.out.print(k.getName()+"\t");
				System.out.print(k.getSum()+"\t");
				System.out.print(k.getAvg()+"\t");
				System.out.println(k.getHak());
			}
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				ois.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
			}			
		}
	}
}
