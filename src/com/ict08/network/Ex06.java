package com.ict08.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.net.URLConnection;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.xml.sax.InputSource;
import org.w3c.dom.NodeList;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
// xml 파싱 : 데이터를 분석해서 원하는 데이터를 추출하는것
// 파서 : 파싱을 해주는 프로그램

// XMl 파싱 : 기상청
public class Ex06 {
	public static void main(String[] args) {
		BufferedReader br = null;
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
		Document document = null;
		try {
			URL url = new URL("https://www.kma.go.kr/XML/weather/sfc_web_map.xml");
			URLConnection conn = url.openConnection();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"));
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while((msg=br.readLine())!=null) {
				sb.append(msg+"\n");
			}
//			System.out.println(sb.toString());
			// StringBuffer 저장된 내용읽기 
			 InputSource is = new InputSource(new StringReader(sb.toString()));
			
			// xml 파싱하기 : 페이지에 접근해줄 Document객체 생성
			builder = factory.newDocumentBuilder();
			document = builder.parse(is);
			
			// 태그와 속성 텍스트 추출하기
			NodeList local =  document.getElementsByTagName("loacal");

			// 2. for문을 사용해 local r갯수 만큼 반복하자 
			StringBuffer sb2 = new StringBuffer();
			for (int i = 0; i < local.getLength(); i++) {
				//테그의 글자 추출
				sb2.append(local.item(i).getFirstChild().getNodeValue()+", ");
				
				// 태그의 속성 추출
				sb2.append( ((Element)local.item(i)).getAttribute("ta")+",  ");
				sb2.append( ((Element)local.item(i)).getAttribute("desc")+"\n");
			}
			
			
		} catch (Exception e) {
		}finally {
			try {
				
			} catch (Exception e2) {
			}
		}
	}
}
