package com.ict07.IO;

import java.io.File;
import java.io.FileWriter;

public class Ex15 {
	public static void main(String[] args) {
		// 문자 스트림(사람중심) : 모든 처리를 2byte씩 처리 
		// 대상 : 전세계 모든 언어로 구성된 문서 파일듯
		// 최상위 클래스 : Reader(입력), Writer(출력)
		
		// FileOutputStream(바이트) : 1byte 처리, write(int b), write(byte[] b) 
		// FileWriter(문자) : 2byte 처리, write(int b), write(char[] b), write(String str);
		
		String pathname = "c:"+File.separator+"study"+
								File.separator+"util"+File.separator+"ict05.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			
			// 한글자 쓰기
			fw.write(97);  // a
			fw.write(65);  // A
			
			fw.write('J');
			fw.write('A');
			fw.write('V');
			fw.write('A');
			fw.write('대');  // FileOutputStream은 안되지만 FileWriter는 가능
			fw.write('한');  // FileOutputStream은 안되지만 FileWriter는 가능
			fw.write('J');
			fw.write('A');
			fw.write('V');
			fw.write('A');
			
			char[] c = {'k','o','r','e','a',13,'대','한','민','국'};
			fw.write(c);
			
			fw.write("한국ICT인재개발원\n");
			fw.write("1강의장\n");
			fw.write("자바수업\n");
			
			
			
			fw.flush();
		} catch (Exception e) {
		}finally {
			try {
				fw.close();
			} catch (Exception e2) {
			}
		}
		
		
		
	}
}
