package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex12 {
	public static void main(String[] args) {
		// c:\\study\\util\\java_1.png 파일을
		// c:\\study\\util\\res\\ 안에 복사하는 코딩
		
		// 읽는 위치 
		String pathname1 = "C:" +File.separator+ "study"+ File.separator+"util"
							+File.separator+"java_2.jpg";
		File read_file = new File(pathname1);
		
		// 쓰는 위치
		String pathname2 = "C:" +File.separator+ "study"+File.separator+"util"+File.separator+"res"+
							File.separator+"java_2.jpg";
		File write_file = new File(pathname2);
		
		// 읽어서 쓰기
		// InputStream
		FileInputStream fis = null;
		BufferedInputStream bis =null;
		
		// Out
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;		
		try {
			fis = new FileInputStream(read_file);
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream(write_file);
			bos = new BufferedOutputStream(fos);
			// 그림 소리 동영상 파일들을 처리할때는 무조건 1byte씩 처리해야 된다
			int k =0;
			// 1byte 읽기
			while ((k = bis.read())!=-1) {
				// 1byte 쓰기 
				bos.write(k);
			}
			bos.flush();
			
			
				
		} catch (Exception e) {
		}finally {
			try {
				bos.close();
				fos.close();
				bis.close();
				fis.close();
				// 파일이 열려 있으면 삭제할수 없다 
				// 원본파일을 삭제
				read_file.delete();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		
		
		
	}
}
