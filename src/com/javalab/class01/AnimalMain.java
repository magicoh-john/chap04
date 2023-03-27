package com.javalab.class01;

public class AnimalMain {

	public static void main(String[] args) {
		
		String ani1 = "포유류,코끼리,5000";
		String ani2 = "포유류,소,500";
		String ani3 = "어류,고래,30000";
		String ani4 = "파충류,악어,2000";
		String ani5 = "조류,부엉이,20";
		
		String[] strAni1 = ani1.split(",");		
		Animal animal1 = new Animal(strAni1[0], strAni1[1], Integer.parseInt(strAni1[2]));

		String[] strAni2 = ani2.split(",");		
		Animal animal2 = new Animal(strAni2[0], strAni2[1], Integer.parseInt(strAni2[2]));

		String[] strAni3 = ani3.split(",");		
		Animal animal3 = new Animal(strAni3[0], strAni3[1], Integer.parseInt(strAni3[2]));

		String[] strAni4 = ani4.split(",");		
		Animal animal4 = new Animal(strAni4[0], strAni4[1], Integer.parseInt(strAni4[2]));

		String[] strAni5 = ani5.split(",");		
		Animal animal5 = new Animal(strAni5[0], strAni5[1], Integer.parseInt(strAni5[2]));

		// Animal Type의 객체를 담을 수 있는 선언
		Animal[] animals = new Animal[5];
		animals[0] = animal1;
		animals[1] = animal2;
		animals[2] = animal3;
		animals[3] = animal4;
		animals[4] = animal5;
		
		for (Animal animal : animals) {
			System.out.printf("%s \t %s \t %d \n", animal.getType(), animal.getName(), animal.getWeight());
		}
		
		/*
		String[] animal = new String[5];
		animal[0] = "포유류,코끼리,5000";
		animal[1] = "포유류,소,500";
		animal[2] = "어류,고래,30000";
		animal[3] = "파충류,악어,2000";
		animal[4] = "조류,부엉이,20";
		
		String[] strAni = null;
		
		// 배열의 첫번째 요소를 잘라서 동물 객체 생성
		strAni = animal[0].split(",");
		Animal animal1 = new Animal(strAni[0], strAni[1], Integer.parseInt(strAni[2]));

		// 배열의 두번째 요소를 잘라서 동물 객체 생성
		strAni = animal[1].split(",");
		Animal animal2 = new Animal(strAni[0], strAni[1], Integer.parseInt(strAni[2]));

		// 배열의  세번째 요소를 잘라서 동물 객체 생성
		strAni = animal[2].split(",");
		Animal animal3 = new Animal(strAni[0], strAni[1], Integer.parseInt(strAni[2]));
		
		// 배열의  네번째 요소를 잘라서 동물 객체 생성
		strAni = animal[3].split(",");
		Animal animal4 = new Animal(strAni[0], strAni[1], Integer.parseInt(strAni[2]));
		
		// 배열의  다섯번째 요소를 잘라서 동물 객체 생성
		strAni = animal[4].split(",");
		Animal animal5 = new Animal(strAni[0], strAni[1], Integer.parseInt(strAni[2]));

		// Animal Type의 객체를 담을 수 있는 선언
		Animal[] animals = new Animal[5];
		animals[0] = animal1;
		animals[1] = animal2;
		animals[2] = animal3;
		animals[3] = animal4;
		animals[4] = animal5;
		
		for (int i = 0; i < animals.length; i++) {
			System.out.printf(" %s \t %s \t %d \n", animals[i].getType(), animals[i].getName(), animals[i].getWeight());
		}

		for (Animal animal6 : animals) {
			
		}
		*/
	}

}
