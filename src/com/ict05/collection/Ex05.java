package com.ict05.collection;

import java.util.Iterator;
import java.util.Stack;

public class Ex05 {
	// List 인터페이스를 구현한 클래스들 : Stack, ArrayList, Vector;
	// Stack (스택) : LIFO (last In First Out) : 마지막에 들어온 데이터가 맨 처음 나간다
	// 주요 메소드 
	// add, push, addElemnt = > 추가
	// add (index, E) => 삽입
	// pop : 맨위에 존재하는 객체를 반환 하고 삭제 한다
	// peek : 맨위에 존재하는 객체글 반환 하고 삭제하지 않는다(무한루프 조심) 
	// search : 검색 (오른쪽, 1부터)
	// indexOf : 검색(왼쪽, 0부터) => 배열방식
	// elementAt(index) : 위치값을 받아서 해당 객체 추출  
	// get(index) : 위치값을 받아서 해당 객체 추출  
	// firstElement : 맨처음 요소 추출
	// lastElement : 맨 마지막 요소 추출
	// setElement(Element, index) : 치환

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.add("둘리");
		stack.addElement("공실");
		stack.push("마이콜");
		System.out.println(stack);
		
		stack.add(1, "도우너");		// 삽입
		System.out.println(stack);
		stack.add(0, "또치");		// 삽입
		System.out.println(stack);
		stack.add(1, "뿌끄");		// 삽입 (중복이 아니다)
		System.out.println(stack);
		stack.add(1, "둘리");		// 중복 사용가능
		System.out.println(stack);
		System.out.println("==================");
		// 마지막 개체 보기 pop(삭제 O), peek(삭제X = for문 사용시 무한 루프)
		System.out.println(stack.peek());
		System.out.println(stack);
		
		System.out.println(stack.pop());
		System.out.println(stack);
		// contains, indexOf, search, get, elementAt, firstElement, lastElement
		if (stack.contains("둘리")) {
			//System.out.println("존재");
			//해당 객체 위치값
			System.out.println(stack.indexOf("둘리") + "번째위치");
			System.out.println(stack.search("둘리") + "번째위치");
			// 해당 위치 객체 꺼내기 
			System.out.println(stack.get(1));
			System.out.println(stack.get(stack.indexOf("둘리")));
			System.out.println(stack.elementAt(stack.indexOf("둘리")));
			System.out.println(stack.firstElement());
			System.out.println(stack.lastElement());
		}else {
			System.out.println("존재 안함");
		}
		
		
		// size, setElementAT
		System.out.println(stack.size()+ "요소가 존재합니다");
		// index가 3인 
		stack.set(3, "마이콜");
		// stack.setElementAt("마이콜" , 3);
		System.out.println(stack);
		
		// 하나씩 꺼내기 (개선된 for, iterator (데이터가 그대로 존재), pop (데이터가 삭제됨)
		// 개선된 for문 
		for (String k : stack) {
			System.out.println(k);
		}
		System.out.println(stack.size()+ "요소가 존재함");
		
		Iterator<String> it = stack.iterator();
		while (it.hasNext()) {
			String msg = (String) it.next();
			System.out.println(msg);
		}
		System.out.println(stack.size() + "요소가 존재");
		
		while (! stack.isEmpty()){
			String k = stack.pop();
			System.out.println(k + "삭제됨, 크기는 "+ stack.size());
		}
		
	}	
}
