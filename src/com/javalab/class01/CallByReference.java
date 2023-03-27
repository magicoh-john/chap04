package com.javalab.class01;

/**
 * 메소드간 파라미터 전달(배열, 객체와 같은 여러개 값을 담는 객체의 주소값 전달) - 콜바이 레퍼런스(Call by reference) :
 * 참조 주소값 복사
 */
public class CallByReference {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int e = 5;

		printArray(numbers); // printArray 메소드 호출		
		System.out.println();
		printArray(a, b, c, d, e); // 배열 출력 메소드 호출

	}

	private static void printArray(int a, int b, int c, int d, int e) {
		System.out.println(a + " " + b + " " + c + " " + d + " " + e);
	}

	// 배열을 전달 받아서 출력해주는 메소드
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr + " ");
		}
	}
}
