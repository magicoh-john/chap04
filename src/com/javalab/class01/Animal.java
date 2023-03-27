package com.javalab.class01;

/**
 * Animal 클래스
 */
public class Animal {

	//필드
	private String type;	//동물의 종류
	private String name;	//이름
	private int weight;		//몸무게
	
	public Animal() {
	}

	public Animal(String type, String name, int weight) {
		this.type = type;
		this.name = name;
		this.weight = weight;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
}
