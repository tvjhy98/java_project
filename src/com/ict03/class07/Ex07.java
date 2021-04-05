package com.ict03.class07;

interface Remote{
	void on();
	void off();
}

class Radio{
	public void radioWOrk() {
		Remocon radio = new Remocon() {
			@Override
			public void on() {
				System.out.println("radio¸¦ ÄÕ´Ï´Ù");
			}
		
			@Override
			public void off() {
				System.out.println("radio¸¦ ²ü´Ï´Ù");
			}
		};
	radio.on();
	radio.off();
	}
	public void machineWork(Remote remte) {
		remte.on();
		remte.off();
	
	}
		
}
class Ex07{
	public static void main(String[] args) {
		Radio radio = new Radio ();
		radio.machineWork(new Remote(){

			@Override
			public void on() {
				System.out.println("radio ÄÑ±â");
				
			}

			@Override
			public void off() {
				System.out.println("radio ²ô±â");
				
			}
			
		});
			
		
	}
}





