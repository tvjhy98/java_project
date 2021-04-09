package com.ict06.Thread;

import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class Ex17_Car {
	private List<String> carList = null;
	public Ex17_Car() {
		carList = new ArrayList<String>();
		
	}
	public String getCar() {
		String carName = null;
		switch ((int)(Math.random()*3)){
			case 0 : carName = "SM5"; break;
			case 1 : carName = "매그너스"; break;
			case 2 : carName = "카렌스"; break;
			
		}
		return carName;
		
	}
	// 소비자가 자도차를 사는 메소드
	public synchronized String pop() {
		String carName=null;
		if(carList.size()==0) {
			try {
				System.out.println("차가 없어요 생산할때 까지" + "기다리세요");
				this.wait();
				
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// 재고가 있을떄는 carList에서 가장 나중에 들어간 차를 판매(삭제)
		carName = (String)carList.remove(carList.size()-1);
		System.out.println("손님이 차를 사갔습니다.." + "손님이 구입한 차 이름은=>\" " + carName+"\"");
		return carName;
		
	}
	// 자동차를 carList에 넣기
	// 창고 자동차가 5대가 되면 소비자들에게 판매를 시작한다.
	public synchronized void push(String car) {
		carList.add(car);
		System.out.println("차가 만들어졌습니다" + "차 이름은\" "+car+"\"");
		if(carList.size()==5) {
			// 재고가 0일때 대기시킨 스레드로 준비시킨다
			this.notify();
		}
	}
	
	
}








