package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex06 {
	public static void main(String[] args) {
		//�ӵ� ����� ���ؼ� BufferedOutputStream 
		
		// 1. FileOutputStream : ������ ������� 1byte�� ������ ���⸦ �� �� �ִ� ��Ʈ��
		//   - ������ : FileOutputStream(File file), FileOutputStream(File file, boolean append)
		//              FileOutputStream(String name),FileOutputStream(String name, boolean append)
		//       File file , String name => Ư����ġ + �����̸�  
		//       boolean append : false or ������ �ϸ� �����, true�� �ϸ� �̾��
		//  - �ֿ�޼ҵ�
		//    write(int b)     => �ѱ��� ���� ����(�����ڴ�ҹ���,����,�Ϻ�Ư�����ڸ� ����)	
		//    write(byte[] b)  => �������ڸ� byte[]�� �־ ���� ����
		//    flush()          => write �� �ݵ�� ��������
		//    close()          => open�� ��Ʈ�� �ݱ�( ����� �ݱ�), ���� finally�� ó��
		
		// Ư����ġ�� ���ϱ��� ����
		String pathname = "C:"+File.separator+"study"+File.separator
							+"util"+File.separator+"ict02.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			// ���������� ������ ����� �ϰ�, ������ �����Ѵ�.
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			// ���������� ������ �̾�� �ϰ�, ������ �����Ѵ�.
			// fos = new FileOutputStream(file, true);
			
			// �ѱ��� ���� 
			bos.write(65); // A
			bos.write(97); // a
			
			// int �̱� ������ char�� ����� �� �ִ�.
			bos.write('j');
			bos.write('a');
			bos.write('v');
			bos.write('a');
			
			// �ڹٿ��� �ٺ��� 13(Carriage return = CR = \r) �̴�.
			// �ٸ� ����߿��� (\r\n(Line feed = 10)�� ���� ����ϴ� ��쵵 �ִ�.)
			bos.write(13); 
			
			// �迭�� �̿��ؼ� �������� ����
			byte[] b = {'H','i','J','A','V','A',13};
			bos.write(b);
			
			// String�� �̿�����(�����̿� ���ڵ� ����)
			String str="Hell\r�ȳ�\r123\r����";
			byte[] b2 =str.getBytes();
			bos.write(b2);
			
			bos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}









