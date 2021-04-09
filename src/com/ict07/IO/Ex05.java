package com.ict07.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) {
		// 1. FileOutputStream : 파일을 대상으로 1byte씩 데이터 쓰기를 할수 있는 스트림
		//	- 생성자 : FileOutputStream(File file), FileOutputStream(File file, boolean append),
		//			 	FileOutputStream(String name), FileOutputStream(String name, boolean append)
		// 		File file, String name => 특정 위치 + 파일 이름 
		//		boolean append : false or 생략을 하면 덮어 쓰기, true을 하면 이어 쓰기 
		//  - 주요메소드
		//  	write(int b)	=> 한글자 쓰기 가능 (영문자 대소문자
		// 		write (byte[] b) => 여러글자를 byte[]에 넣어서 쓰기 가능 
		// 		flush()			=> write 후 반드시 실행하자 
		//      close()			=> open된 스트림 닫기 (사용후 닫기), 보통 finally로 처리 
		
		// 특정위치의 파일까지 지정
		String pathname = "C"+File.separator+"study"+File.separator
							+"util"+File.separator+"ict01.txt";
		File file = new  File(pathname);
		FileOutputStream fos = null;
		try {
			// 기존 파일이 있으면 덮어쓰기 하고 없으면 생성한다
			fos = new FileOutputStream(file);
			
			// 기존 파일이 있으면 이어쓰기 하고 없으면 생성한다
			// fos = new FileOutputStream(file, true);
			
			// 한글자 쓰기
			
				fos.write(65);
				fos.write(97);
				// int 이기 떄문에 char사용가능
				fos.write('j');
				fos.write('a');
				fos.write('v');
				fos.write('a');
				
				fos.write(13);
				
				byte[] b = {'b', 'o', 'y', 's',13,'g','i','r','l','s',13};
				fos.write(b);
				// Stirng 이용하자 (영어 이외 문자 가능)
				String str = "Hell\r안녕\r123\r大韓";
				str.getBytes();
			fos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
