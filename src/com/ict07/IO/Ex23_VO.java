package com.ict07.IO;

import java.io.Externalizable;
import java.io.Serializable;

// 객체 직렬화나 역직렬화를 하기 위해 Serializable나 Externalizable를 상속 받아야 한다 
// Serializable 상속 받으면 해당 클래스를 객체로 만들때 가지고 있느 모든 멤버들이 대상이 된다 
// 단 변수 앞에 transient 예약어를 사용하면 직렬화 대상에서 제외된다
//		제외된 변수의 데이터는 기본값을 갖는다 (int는 0 double은 0.0, boolean는 false)
public class Ex23_VO implements Serializable{
	transient private String name;
	private int age;
	transient private double weight;
	transient private boolean gender;
	
	public Ex23_VO() {}

	public Ex23_VO(String name, int age, double weight, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	
	
	
}
