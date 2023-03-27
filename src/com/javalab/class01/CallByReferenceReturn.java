package com.javalab.class01;
/**
 * 메소드간 파라미터 전달(배열, 객체와 같은 여러개 값을 담는 객체의 주소값 전달)
 *  - 콜바이 레퍼런스(Call by reference) : 참조 주소값 복사
 */
public class CallByReferenceReturn {

    public static void main(String[] args) {
    	
        int[] numbers = { 1, 2, 3, 4, 5 };
        int[] newNumbers = addTen(numbers); // 메소드 호출하고 반환된 값을 받음
        
        for (int i = 0; i < newNumbers.length; i++) {
        	System.out.println(newNumbers[i]);
		}
    }

    // 전달받은 배열의 요소에 10을 더해주는 메소드
    public static int[] addTen(int[] arr) {
		int[] arrNums = null;
		arrNums = new int[arr.length]; // 5칸짜리 새로운 배열이 만들어짐.

		arrNums[0] = arr[0] + 10;
		arrNums[1] = arr[1] + 10;
		arrNums[2] = arr[2] + 10;
		arrNums[3] = arr[3] + 10;
		arrNums[4] = arr[4] + 10;
		
        for (int i = 0; i < arr.length; i++) {
        	arrNums[i] = arr[i] + 10;
        }
        return arrNums; // 값 반환
    }
}
