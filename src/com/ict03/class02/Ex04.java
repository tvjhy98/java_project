package com.ict03.class02;

import java.util.Random;
import java.util.Scanner;

public class Ex04 {
	// °¡À§(0)  ¹ÙÀ§(1)  º¸(2) 
	// ÄÄÇ»ÅÍ¶û ÇÃ·¹ÀÌ
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int totalcount = 0 ;
		int vcount = 0 ;
		
		esc:
		while(true) {
			totalcount++;
			// ÄÄÇ»ÅÍ
			int computer = (int)(Math.random()*3); // 0,1,2
			System.out.println("1. °¡À§, 2.¹ÙÀ§, 3.º¸  >>> ");
			int user = scan.nextInt();
			if (computer == 0) {
				if (user == 1) {
					System.out.println("ºñ±è");
				}else if(user==2) {
					System.out.println("ÀÌ±è");
				}else if (user==3) {
					System.out.println("Áü");
				}
			}else if(computer == 1) {
				if (user == 1) {
					System.out.println("Áü");
				}else if(user==2) {
					System.out.println("ºñ±è");
				}else if (user==3) {
					System.out.println("ÀÌ±è");
				}
			}else if (computer == 2) {
				if (user == 1) {
					System.out.println("ÀÌ±è");
				}else if(user==2) {
					System.out.println("Áü");
				}else if (user==3) {
					System.out.println("ºñ±è");
				}
			}
			while(true ) {
			System.out.println("°è¼ÓÇÒ±î¿ä?(y/n) >>>");
			String msg = scan.next();
			if (msg.equalsIgnoreCase("y")) {
				continue esc;
			}else if (msg.equalsIgnoreCase("n")) {
				break esc;
			}else {
				continue;
			}
		}
		}
		System.out.println("¼ö°í ÇÏ¼Ì½À´Ï´Ù");
		System.out.println("´ç½ÅÀÇ µµÀüÈ½¼ö: " + totalcount + ", ½Â·ü : " + (vcount*1.0/totalcount)*100+"%");
		
		
		
		
		
		
		
	
		
		
		
		
	
	}
}






