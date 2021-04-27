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
// xml �Ľ� : �����͸� �м��ؼ� ���ϴ� �����͸� �����ϴ°�
// �ļ� : �Ľ��� ���ִ� ���α׷�

// XMl �Ľ� : ���û
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
			// StringBuffer ����� �����б� 
			 InputSource is = new InputSource(new StringReader(sb.toString()));
			
			// xml �Ľ��ϱ� : �������� �������� Document��ü ����
			builder = factory.newDocumentBuilder();
			document = builder.parse(is);
			
			// �±׿� �Ӽ� �ؽ�Ʈ �����ϱ�
			NodeList local =  document.getElementsByTagName("loacal");

			// 2. for���� ����� local r���� ��ŭ �ݺ����� 
			StringBuffer sb2 = new StringBuffer();
			for (int i = 0; i < local.getLength(); i++) {
				//�ױ��� ���� ����
				sb2.append(local.item(i).getFirstChild().getNodeValue()+", ");
				
				// �±��� �Ӽ� ����
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
