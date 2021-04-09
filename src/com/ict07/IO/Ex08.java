package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex08 {
	public static void main(String[] args) {
		// 속도 향상을 위해서 BufferedInputStream를 사용한다 
		// 혼자서는 사용할수 없고 반드시 InputStream를 받아서 사용
		// 생성자 : BufferedInputStream(InputStreaem in)
		
		String pathname = "C:"+File.separator+"study"+ File.separator+"util"
								+File.separator+"ict01.txt";
		File file = new File(pathname);
		FileInputStream fis =null;
		BufferedInputStream bis = null;
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			// 한글자 읽어 오기 : read() > 숫자 >형변환
			// int k =fis.read();
			//System.out.println(k+":" + (char)(k));
			
			// 한글자씩 계속 읽기: 그림 소리 동영상 파일을 모조건 해당 방식을 사용
			//						비 영어권인 문자들은 읽을 없다 
			/*
			int k = 0;
			while (true) {
				k = fis.read();
				if(k ==-1)break;
				System.out.println(k+":"+(char)(k));
			}
			*/
			
//			int k = 0;
//			// fis을 이용해서 한 글자을 읽었을때 -1과 같지 않으면 실행해라
//			while((k=fis.read())!=-1) {
//				System.out.println(k+":"+(char)(k));
//			}
			
			//배열을 이용하는법 : 비영어권 사용불가
			//
//			byte[] b = new byte[(int)(file.length())];
//			fis.read();
//			for(byte k : b) {
//				System.out.println(k+":"+(char)(k));
//			}
			
			
			//String 이용
			byte[] b = new byte[(int)(file.length())];
			bis.read(b);
			String str = new String(b);
			System.out.println(str);
		
			
			
			
		} catch (FileNotFoundException e) {		
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bis.close();
				fis.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
}
