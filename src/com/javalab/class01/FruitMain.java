package com.javalab.class01;

/**
 * 실행클래스
 */
public class FruitMain {

	public static void main(String[] args) {
		
		// 객체 한개 생성
		// 객체 한개를 생성합니다.(깃허브에서 테스트로 소스코드 수정함)
		Fruit peach = new Fruit();
		peach.setName("복숭아");
		peach.setPrice(6500);
		peach.setQuantity(5);
		
		printFruit(peach);
		System.out.println();
		
		// 과일 객체 생성
		Fruit apple = new Fruit("사과", 2000, 5);
		Fruit mango = new Fruit("망고", 1000, 2);
		Fruit banna = new Fruit("바나나", 2500, 3);
		Fruit pineapple = new Fruit("파인애플", 5000, 1);
		Fruit orange = new Fruit("오렌지", 6000, 4);

		// 과일 객체 5개 전달해서 받아서 출력하는 메소드 만드세요.
		printFruit(apple, mango, banna, pineapple, orange);
		System.out.println();
		
		// 1. 과일 객체 Array 선언
		Fruit[] fruits = new Fruit[5];
		fruits[0] = apple;
		fruits[1] = mango;
		fruits[2] = banna;
		fruits[3] = pineapple;
		fruits[4] = orange;
		
		printFruit(fruits);

	}
	
	private static void printFruit(Fruit[] fruits) {
		for (Fruit fruit : fruits) {
			System.out.println(fruit.getName() + "\t" + fruit.getPrice() + "\t" + fruit.getQuantity());
			
		}
	}

	private static void printFruit(Fruit apple, Fruit mango, Fruit banna, Fruit pineapple, Fruit orange) {
		System.out.println(apple.getName() + "\t" + apple.getPrice() + "\t" + apple.getQuantity());
		System.out.println(mango.getName() + "\t" + mango.getPrice() + "\t" + mango.getQuantity());
		System.out.println(banna.getName() + "\t" + banna.getPrice() + "\t" + banna.getQuantity());
		System.out.println(pineapple.getName() + "\t" + pineapple.getPrice() + "\t" + pineapple.getQuantity());
		System.out.println(orange.getName() + "\t" + orange.getPrice() + "\t" + orange.getQuantity());
	}

	private static void printFruit(Fruit peach) {
		System.out.println(peach.getName() + "\t" + peach.getPrice() + "\t" + peach.getQuantity());
		
	}

	
}
