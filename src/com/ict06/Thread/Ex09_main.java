package com.ict06.Thread;

public class Ex09_main {
	public static void main(String[] args) {
		Ex07 t1 = new Ex07();
		Ex08 t2 = new Ex08();
		Ex09 t3 = new Ex09();
		
		// Ex07,Ex08,Ex09澗 Runnable聖 雌紗閤紹奄 凶庚拭 start五社球亜 蒸陥
		// start() 亜 蒸陥
		// t1.start();
		
		
		// 叔楳拝 run()五社球研 亜遭 聡 展為聖 走舛背醤吉陥
		Thread thread1 = new Thread(t1);
		thread1.start();
		
		new Thread(t2).start();
		
		Thread thread3 = new Thread(t3);
		thread3.start();
		
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					System.out.println(Thread.currentThread().getName()+": けけけけけけ");
				}
				
			}
		}).start();;
		
		
	}
}
