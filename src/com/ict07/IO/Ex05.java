package com.ict07.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) {
		// 1. FileOutputStream : ������ ������� 1byte�� ������ ���⸦ �Ҽ� �ִ� ��Ʈ��
		//	- ������ : FileOutputStream(File file), FileOutputStream(File file, boolean append),
		//			 	FileOutputStream(String name), FileOutputStream(String name, boolean append)
		// 		File file, String name => Ư�� ��ġ + ���� �̸� 
		//		boolean append : false or ������ �ϸ� ���� ����, true�� �ϸ� �̾� ���� 
		//  - �ֿ�޼ҵ�
		//  	write(int b)	=> �ѱ��� ���� ���� (������ ��ҹ���
		// 		write (byte[] b) => �������ڸ� byte[]�� �־ ���� ���� 
		// 		flush()			=> write �� �ݵ�� �������� 
		//      close()			=> open�� ��Ʈ�� �ݱ� (����� �ݱ�), ���� finally�� ó�� 
		
		// Ư����ġ�� ���ϱ��� ����
		String pathname = "C"+File.separator+"study"+File.separator
							+"util"+File.separator+"ict01.txt";
		File file = new  File(pathname);
		FileOutputStream fos = null;
		try {
			// ���� ������ ������ ����� �ϰ� ������ �����Ѵ�
			fos = new FileOutputStream(file);
			
			// ���� ������ ������ �̾�� �ϰ� ������ �����Ѵ�
			// fos = new FileOutputStream(file, true);
			
			// �ѱ��� ����
			
				fos.write(65);
				fos.write(97);
				// int �̱� ������ char��밡��
				fos.write('j');
				fos.write('a');
				fos.write('v');
				fos.write('a');
				
				fos.write(13);
				
				byte[] b = {'b', 'o', 'y', 's',13,'g','i','r','l','s',13};
				fos.write(b);
				// Stirng �̿����� (���� �̿� ���� ����)
				String str = "Hell\r�ȳ�\r123\r����";
				str.getBytes();
			fos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}