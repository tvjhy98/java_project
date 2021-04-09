package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Ex09 {
	public static void main(String[] args) {
		// c:\\study\\utill\\test100.txt 파일안에
		// 이름 : 000
		// 나이 : 00
		// 전번 : 010-0000-0000
		// 작성하는 코딩
		
		String pathname = "C:"+File.separator+"study"+File.separator+"util"
							+File.separator+"test100.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			
			String msg = "이름 : 윤호준\n나이 : 24\n전화 번호 : 010-9066-0794";
			byte [] b = msg.getBytes();
			fos.write(b);
			fos.flush();
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
