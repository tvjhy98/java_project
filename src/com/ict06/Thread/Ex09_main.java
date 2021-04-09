package com.ict06.Thread;

public class Ex09_main {
	public static void main(String[] args) {
		Ex07 t1 = new Ex07();
		Ex08 t2 = new Ex08();
		Ex09 t3 = new Ex09();
		
		// Ex07,Ex08,Ex09는 Runnable을 상속받았기 때문에 start메소드가 없다
		// start() 가 없다
		// t1.start();
		
		
		// 실행할 run()메소드를 가진 즉 타겟을 지정해야된다
		Thread thread1 = new Thread(t1);
		thread1.start();
		
		new Thread(t2).start();
		
		Thread thread3 = new Thread(t3);
		thread3.start();
		
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					System.out.println(Thread.currentThread().getName()+": ㅁㅁㅁㅁㅁㅁ");
				}
				
			}
		}).start();;
		
		
	}
}
