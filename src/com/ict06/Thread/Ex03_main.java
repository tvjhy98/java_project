package com.ict06.Thread;

public class Ex03_main {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Ex03 t1 = new Ex03();
		t1.go();
		System.out.println("수고하셨습니다");
		System.out.println("===============");
		
		// 스레드 처리하기 위해서 start()를 호출했다
		// run() 으로 가야하지만 start()가 있어서 start()로간다
		// 이것은 스레드 처리가 아니다
		// start() => run()로 가게 된다
		// 이것을 스레드 처리했다고 한다
		System.out.println(Thread.currentThread().getName());
		t1.start();
		System.out.println("수고하셨습니다");
		System.out.println("==============");
		
		
	}
}
