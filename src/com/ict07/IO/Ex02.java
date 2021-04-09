package com.ict07.IO;

import java.io.File;
import java.text.SimpleDateFormat;

public class Ex02 {
	public static void main(String[] args) {
		// file Ŭ������ ����ϱ� ���� Ư�� ��ġ�� ����
		String pathname_1 = "C:\\study\\utill";		// �ü���� windows �ϋ�
		String pathname_2 = "C:/study/util";		// �ü���� Linux, Unix �϶� 
		
		// �ü���� ������� ����ϴ� ���
		String pathname_3 = "C:"+ File.separator+"study" + File.separator+"util";
		
		File file = new File(pathname_3);
		String [] arr = file.list();
		
		// ��¥ ���� ����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM -dd hh:mm");
		
		for (String k : arr) {
			System.out.println(k);
			File file2 = new File(pathname_3, k);
			// System.out.println(file2);
			// ��ǻ�Ϳ� �����Ҽ� �ִ� ������ ���丮�� ���Ϲۿ� ����
			
			// ���� ��¥ ���ϱ� 		
			if (file2.isDirectory()) {
				 System.out.println("���丮" + file2 + "\nũ��:ũ�Ⱑ �������� ����"+
						 			"������ ��¥ : "+ sdf.format(file2.lastModified())+"\n");
			}else {
			System.out.println("���� : " + file2 + 
					"ũ�� : " +(int)(file2.length()/1024)+"KB" );
		}
		
		}
	}
}
