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
				System.out.println("radio�� �մϴ�");
			}
		
			@Override
			public void off() {
				System.out.println("radio�� ���ϴ�");
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
				System.out.println("radio �ѱ�");
				
			}

			@Override
			public void off() {
				System.out.println("radio ����");
				
			}
			
		});
			
		
	}
}





