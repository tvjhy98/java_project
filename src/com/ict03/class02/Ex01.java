package com.ict03.class02;

public class Ex01 {

	public static void main(String[] args) {
		// String 클래스
		String str1 = "abc" ;
		
		char [] data = {'a','b','c' };
		String str2 = new String (data);
		
		byte [] data2 = {97,98,99};
		String str3 = new String (data2);
		
		String str4 = new String ("abc");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println("====== 주요 메소드 =======");
		String msg = "한국 ICT 인재 개발원 1강의장";
		
		// 1. charAt(int index) : char 
		//	위치값을 받아서 그위치에 존재하는 문자를 반환 한다
		// 이떄 위치값은 (index는 0 부터 이다)
		char c1 = msg.charAt(7); // 인
		System.out.println(c1);
		
		// 문제) 다음 문자들 중에 소문자를 대문자로 변경하시오
		// 힌트) a = 97, A는 65이다 (차이는 32)
		msg = "대한 I Love You 123";
		// 문자열의 길이를 구하자 : length() : int 
		System.out.println(msg.length());
		for (int i = 0; i < msg.length(); i++) {
			char c2 = msg.charAt(i);
			if (c2>= 'a' && c2 <= 'z') {
				c2 = (char)(c2-32);
			}
			System.out.print(c2);
		}
		System.out.println();
		
		// 2.concat(String str) : String 
		// 지정한 문자열을 이문자열 끝에 연결합니다
		String msg1 = "대한민국";
		String msg2 = "KOREA";
		String msg3 = msg1.concat(msg2);
		System.out.println(msg3);
		System.out.println(msg1 + msg2);
		
		// 3. contains(String s) : boolean
		// 받은 문자열에 해당 문자열에 존재하면 ture 존재하지 않으면 false 
		msg = "대한 I Love You 123";
		//boolean b1 = msg.contains("YOU");
		boolean b1 = msg.contains("YOU");
		if(b1) {
			System.out.println("포함되어 있다");
		}else {
			System.out.println("포함되어 있지 않다");
		}
		
		//4. equals(Object anObject) : boolean
		//	받은 문자열과 현재 문자열과 같으면 true, 다르면 false (대소문자 구별)
		//5. equalsIgnoreCase(String anotherString) : boolean
		//		받은 문자열과 현재 문자열과 같으면 true, 다르면 false (대소문자 구별 없음)
		//	**주의) 문자열이나 객체을 비교할떄 '=='는 사용하면 내용이 같냐? 아니라 주소가 같냐?
		//			문자열에는 '==' 사용하면 안됨, equals 또는 equalsIgnoreCase를 사용해야 된다
		String s1 = "Korea";
		String s2 = "KOREA";
		String s3 = new String ("Korea");
		String s4 = new String ("Korea");
		
		System.out.println(s1 == s2);  // false
		System.out.println(s2 == s3);  // false
		System.out.println(s3 == s4);  // false
		System.out.println();
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println();
		
		s1 = "seoul" ;
		s2 = "seoul" ;
		System.out.println(s1 == s2);					// 주소가 같냐?
		System.out.println(s1.equalsIgnoreCase(s2));	// 내용이 같냐?
		
		// 6.format(String format, Object ... args) : static String 
		// 형식을 지정하고 형식에 맞게 생성 
		// %s 는 문자열을 %d는 정수, %f 실수 (반올림 된다)
		String msg4 = "한국 ICT 인재 개발원";
		int s5 = 14;
		double s6 = 89.167;
		String msg5 = msg4.format("%s의 시작년도는 %d년 이고 평균 점수는 %.2f이다.", msg4, s5, s6);
		System.out.println(msg5);
		
		// 7. 	getBytes() : byte[]
		//	해당 문자열을 byte[]로 변경시킨다
		// 	보통 입/출력 스트림할때 사용한다 (영문자 대소문자와 숫자만 가능)
		String msg6 = "java";
		byte [] b = msg6.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.println((char)b[i] + ":" + b[i]);
		}
		
		// 반대로 해당 byte 배열을 문자열로 만들수도 있다 (String 생성자 이용ㅇ)
		String msg7 = new String (b) ;
		System.out.println(msg7);
		
		// 8. 	toCharArray() : char[]
		// 해당 문자열을 char[]로 변경 시킨다
		// 보통 입/출력 스트림할때 사용한다 (전 세계 모든 문자 가능)
		String msg8 = "자바8 java8 大韓民國 123" ;
		char[] c = msg8.toCharArray();
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
 				
		// 반대로 해당 char 배열을 문자열로 만들수도 있다 (String 생성자 이용ㅇ)
		String msg9 = new String (c) ;
		System.out.println(msg9);
		
		// 9. indexOf(int ch) : int 
		// 	문자를 받아서 해당 문자의 위치값을 표시 
		//	시작하는 위치는 처음부터, 찿는 문자가 없으면 -1이다 
		
		// 10.indexOf(int ch, int fromIndex ) :int
		//		문자의 시작위치를 받아서 해당 문자의 위치값을 표시
		// 		찿는 문자가 없으면 -1 이다
		
		// 11. index(String str) : int
		// 	문자를 받아서 해당 문자의 위치값을 표시 
		//	시작하는 위치는 처음부터, 찿는 문자가 없으면 -1이다 
		
		// 10.indexOf(String str, int fromIndex ) :int
		//		문자열과 시작위치를 받아서 해당 문자열의 위치값을 표시
		// 		찿는 문자가 없으면 -1 이다
		
		String msg10 = "BufferedReader";
		//  'e'를 찾아라
		int  k1 = msg10.indexOf('e');
		System.out.println(k1);
		
		// 두번쨰 'e'를 찿아라
		// 	첫번째 'e'가 4이므로 5부터 찿아야 된다
		// k1 = msg10.indexOf('e', 5);
		k1 = msg10.indexOf('e',msg10.indexOf('e')+1);
		System.out.println(k1);
		
		
		// 세번쨰 'e'를 찿아라
		// 	첫번째 'e'가 6이므로 7부터 찿아야 된다
		
		k1 = msg10.indexOf('e', msg10.indexOf('e',msg10.indexOf('e')+1)+1);
		System.out.println(k1);
		
		// 없는 글자 찿기 ('A')
		k1 = msg10.indexOf('A');
		System.out.println(k1);  // -1
		
		b1 = msg10.contains("A");
		System.out.println(b1);  // false
		
		// char말고 String 으로 찿기
		k1 = msg10.indexOf("er");
		System.out.println(k1);
		
		// 두번쨰 "er" 찿기
		k1 = msg10.indexOf("er",msg10.indexOf("er")+1);
		System.out.println(k1);
		
		// 11. lastindexOf(int ch) : int
		//		lastIndexOf(String str) : int
		//		찿는 마자미가 무자나 문장ㄹ의 위치를 표시
		k1 = msg10.lastIndexOf('e');
		System.out.println(k1);
		
		k1 = msg10.lastIndexOf("er");
		System.out.println(k1);
		
		// 12. isEmpty() : boolean
		// 		문자열의 길이가 0이면 true, 아니면 false 
		//		비여 있으면 true, 아니면 false 
		//	13. length() : int
		//		문자열의 길이를 숫자로 표시 
		String msg11 = "";
		String msg12 = "java";
		
		System.out.println(msg.isEmpty());		// true
		System.out.println(msg12.isEmpty());	// false
		
		System.out.println(msg.length());		// 0
		System.out.println(msg.length());		// 4
		
		// 14. 	replace(char oldChar, char newChar) : String 
		//   	replace(String target, String replacement) : String 
		// 		문자나 문자열을 받아서 치환하기
		String msg13 = "대한민국";
		String msg14  = msg13.replace("대한민국", msg13);
		String msg15  = msg13.replace('한', '韓');
		System.out.println();
		System.out.println();
		System.out.println();
		
		// 15. split(string regex) : String[]
		// 		구분자를 받아서 배열로 나눈다(배열의크기는 알아서 자도으로)
		//		split(string regex, int limit) : String []
		//		구분자르 받아서 배여로 나눈다 (limit가 배열의 크기 
		String msg17 = "사과 딸기 망고 오렌지 파인애플";
		String [] res = msg17.split("");
		//System.out.println(res[0]);
		//System.out.println(res[1]);
 		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
 		System.out.println();
 		String [] res2 = msg17.split(",", 3);
 		System.out.println(res2[0]);
 		System.out.println(res[1]);
 		System.out.println(res[2]);
 		
 		String[] res3 = msg17.split(",",10);
 		for (int i = 0; i < res3.length; i++) {
			System.out.println("i= "+i+", res="+ res[i]);
		}
		
 		// 16. substring(int beginIndex) : String 
 		//		시작위치를 받아서 해당 문잘열 끝까지 문자열 추출
 		//   	substring (int beginIndex, int endIndex) : String 
 		//		시작위치와 끝 위치를 받아서 해당 문자열 추출 (끝위치는 포함안됨)
 		
 		String msg18 = "010-7979-9999";
 		String res4 = msg18.substring(4);	// 7979-9999
 		String res5 = msg18.substring(4,8);	// 7979
 		String res6 = msg18.substring(msg18.indexOf('-') +1,msg18.lastIndexOf('-'));	// 7979
		System.out.println(res4);
		System.out.println(res5);
		System.out.println(res6);
		
		String msg19 = "77070" ;
		// 태어난 년도 추출 
		String res7 = msg19.substring(0, 2);
		// 태어난 달 추출
		String res8 = msg19.substring(2, 4);
		
		// 퀴즈 010 777 9999 => 010-XXXX-9999, 010-7777-XXXX
		String quiz = "010-7777-9999";
		String [] answer = quiz.split("-");
		answer[1] = answer[1].replace(answer[1], "XXXX");
		// answer[2] = answer[2].replace(answer[2]
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
		System.out.println();
		System.out.println("====================");
		
		
		
		
		
		// 17. toLowerCase() : String 
		// 		해당 문자열의 모든 대문자을 소문자로 변경
		
		// 18. toUpperCase () : String 
		//		해당 문자열의 모든 소문자를 대문자로 변경
		
		String msg20 = "자바8 java8 Java8";
		String res9 = msg20.toLowerCase();
		String res10 = msg20.toUpperCase();
		System.out.println(res9);
		System.out.println(res10);
		
		// 19. toString() : String 
		//	String 의 toString () : 문자열 자체를 반환
		// 	Object의 toString () : 모든 객체에서 사용가능
		//							객체가 가지고 있는 정보나 값을 문자열로 맅턴할때 사용
		//								(오버라이딩 할때 다시배움)
		String msg21 = "java8 Java8 자바8";
		String res11 = msg21.toString();
		
		System.out.println(msg21);
		System.out.println(msg11);
		
		// 20. trim() : String
		// 		해당 문자열의 앞,뒤 공백 제거, 중간 공백은 제거 못함 (중간 공백은 문자취급 당한다)
		String msg22 = "    java  자바  JAVA      ";
		System.out.println(msg22);
		System.out.println(msg22.trim());
		System.out.println(msg22.length());
		System.out.println(msg22.trim().length());
	
		// 21. valueOf (각종자료형) : static String 
		// 		어떤 자료형이든지 String 으로 변경시킨다
		boolean p1 = true;
		char p2 = 'c';
		int p3 = 100;
		long p4 = 100L;
		float p5 = 100.0f;
		double p6 = 100.0;
		
		// 각종자료형에 +1
		// System.out.println(p1+1); 오류발생(boolean은 + 연산을 할수 없다)
		System.out.println(p2 +1);	// char + 정수는 정수로 나온다
		System.out.println(p3 +1);
		System.out.println(p5 + 1);
		System.out.println(p6 +1);
		System.out.println();
		
		// String으로 변경 시켜서 +1
		System.out.println(String.valueOf(p1) +1);	
		System.out.println(String.valueOf(p2) +1);
		System.out.println(String.valueOf(p4) + 1);
		System.out.println(String.valueOf(p5) +1);
		System.out.println(String.valueOf(p6));
		
		
		System.out.println(p1 + "1");
		System.out.println(p2 + "1");
		System.out.println(p3 + "1");
		System.out.println(p4 + "1");
		System.out.println(p5 + "1");
		System.out.println(p6 + "1");
		
		// 21의 반대 개념 (가종 자료형 모양의 문자열을 각종 자료형 변경
		// Wrapper Class (Boolean, Byte, Short, Integer, Long, Float, Double, Character)
		//					parseXXXX(String s) 메소드를 이요해서 변경 (Character 제외 => String.charAt())
		//	- 각 자료형의 형태르 가진 문자열을 진짜 자료형으로 변경 시키는 클래스들
		// - 원래 의미는 기본 자료형을 객체로 만들때 사용하는 클래스
		//		기본자료형 => 객체형 자동으로 변경 (오토박싱)
		//		객체형 => 기본자료형 자동으로 변경 (오토언박싱)
		
		// 1. boolean형태의 문자열을 boolean형으로 변경
		// Boolean.parseBoolean("true"); Boolean.parseBoolean("나머지 글자")
		
		
			msg = "0" ;
			/*
			boolean형이 아니라서 오류 발생
			if (msg) {
				break;
			};
			*/
			
			boolean a1 = Boolean.parseBoolean(msg);
			if (a1) {
				System.out.println("변경성공1");
			}else {
				System.out.println("변경성공2");
			}
		
		// 2. int형태의 문자열을 int형으로 변경 : Integer.parseInt(String s)
		msg = "100";
		int a2 = Integer.parseInt(msg);
		System.out.println(msg + 10);
		System.out.println(a2 + 10);
		
		// 3. double 형태의 문자열을 double형으로 변경 : Double.parseDouble(String s)
		msg = "3.145";
		double a3 = Double.parseDouble(msg);
		System.out.println(msg + 10);
		System.out.println(a3+10);
		
		// 4. char 형태의 문자열을 char 형으로 변경할 메소드는 없다
		// (단, Character 클래스는 존재한다)
		//	문자열에서 charAt(위치값) 이용하면 된다
		msg = "c";
		char a4 =msg.charAt(0);
		System.out.println(msg+1);
		System.out.println(a4+1);
		System.out.println((char)(a4+1));
		
		// 주민번호 앞자리를 받았다? 나이를 구하자
		String jumin = "941210";
		String gender = "1";
		
		
		// 앞자리 두자리 
		String year = jumin.substring(0, 2);
		// 추출한 두자리 숫자로 변경
		int y_year = Integer.parseInt(year);
		
		// 앞자리 두자리에 19나 20을 붙여라
		// (gender가 1또는 2면 1900년생, 3또는 4면 2000년대 생)
		if(gender.equals("1") || gender.equals("2")) {
			y_year = y_year + 1900;
		}else if(gender.equals("3") || gender.equals("4")) {
			y_year = y_year + 2000;
		}
		// (올해년도 - 구한년도) +1
		int age = 2021 - y_year + 1;
		System.out.println("나이는" + age +"입니다");
		
		
		
	}

}







