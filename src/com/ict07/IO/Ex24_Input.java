package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

// 객체 역직렬화 : ObjectInputStream : readObject()

public class Ex24_Input {
	 public static void main(String[] args) {
		// 객체 역직렬화 : 직렬화 된 파일이나 정보를 원래 내용으로 복원하는 역할을 함 
		String pathename = "";
		 String pathname = "c:"+File.separator+"study"+File.separator+"util"+File.separator+"ict08.ser";
	 	
		 File file = new File(pathname);
		 FileInputStream fis = null;
		 BufferedInputStream bis = null;
		 ObjectInputStream ois = null;
		 
		 try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			// 역직렬화
			ArrayList<Ex24_VO> list = (ArrayList<Ex24_VO>)ois.readObject();
			
			// for문이나 Iterator를 사용
			System.out.println("이름\t나이\t몸무게\t성별");
			for (Ex24_VO k : list) {
				System.out.print(k.getName()+"\t");
				System.out.print(k.getAge()+"\t");
				System.out.print(k.getWeight()+"\t");
				boolean b = k.isGender();
					if(b) {
						System.out.println("남성");
					}else {
						System.out.println("여성");
					}
			}
		
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				ois.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		 
	}
}
