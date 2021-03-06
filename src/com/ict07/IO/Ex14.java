package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Ex14 {
	public static void main(String[] args) {
		// PrintStream : 모든 기본자료형를 출력할수 있다 
		// 				화면에 출력 하려면 System.out를 활용
		//				파일에 출력 할려면 FileOutputStream과 BUfferedOutputStream를 활용
		
		String pathname = "c:"+ File.separator+ "study"+ 
							File.separator+ "util"+File.separator+"ict04.txt";
		File file = new File(pathname);
		 
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			ps = new PrintStream(bos);
			
			// 화면에 출력
			System.out.println(24.1);
			System.out.println(20);
			System.out.println('C');
			System.out.println(true);
			System.out.println("대한민국");
						
						
			// 파일에 출력
			ps.println(24.1);
			ps.println(20);
			ps.println('C');
			ps.println(true);
			ps.println("대한민국");

		} catch (Exception e) {
		}finally {
			try {
				bos.close();
				fos.close();
				
			} catch (Exception e2) {
			}
		}
		
		
	}	
}
