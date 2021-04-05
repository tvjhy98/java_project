package com.ict03.class07;

interface Remocon{
	void on();
	void off();
}

class Machine{
	Remocon tv = new Remocon() {
		@Override
		public void on() {
			System.out.println("Tv�� �մϴ�");
		}
		
		@Override
		public void off() {
			System.out.println("TV�� ���ϴ�");
		}
	};
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
}

public class Ex06 {
	public static void main(String[] args) {
		Machine machine = new Machine();
		machine.tv.on();
		machine.tv.off();
		machine.radio.on();
		machine.radio.off();
	}
}