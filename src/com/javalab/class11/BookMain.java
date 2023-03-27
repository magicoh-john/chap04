package com.javalab.class11;

import com.javalab.class11.vo.Book;
import com.javalab.class11.vo.BookData;

/**
 * 실행클래스
 * 
 */
public class BookMain {

	public static void main(String[] args) {

		BookData bd = new BookData();	//Product 객체 10개 담을 수 있는 배열 선언하고 그 배열에 객를 만들어서 넣음

		//1. 전체 책 리스트를 출력하되 게터(getter) 메소드를 이용해서 필드값을 조회하세요.
		System.out.println("[1]. 전체 책 목록");
		for (Book book : bd.books) {	// BookData객체의 멤버 변수인 books
			System.out.println(book.getTitle() + "\t" + book.getAuthor() + "\t" + book.getPress() + "\t" + book.getPrice() + "\t" + book.getDc());
		}
		System.out.println();
		
		//2. 저자 엘리자베스 롭슨이 출판한 책의 이름은 무엇입니까?
		System.out.println("[2]. 저자 엘리자베스 롭슨이 출판한 책의 이름은 무엇입니까");
		for (Book book : bd.books) {
			if(book.getAuthor().contains("엘리자베스 롭슨")) {
				System.out.println(book.getTitle() + "\t" + book.getAuthor() + "\t" + book.getPress() + "\t" + book.getPrice() + "\t" + book.getDc());
			}
		}
		System.out.println();
		
		System.out.println("[3]. 한빛미디어에서 출판한 모든 책의 리스트를 출력하시오");
		//3. 한빛미디어에서 출판한 모든 책의 리스트를 출력하시오.		
		for (Book book : bd.books) {
			if(book.getPress().contains("한빛미디어")) {
				System.out.println(book.getTitle() + "\t" + book.getAuthor() + "\t" + book.getPress() + "\t" + book.getPrice() + "\t" + book.getDc());
			}
		}
		System.out.println("[4]. 전체 책 가격을 합산하세요.");
		int totalPrice = 0;
		for (Book b : bd.books) {
			totalPrice = totalPrice + b.getPrice();
		}
		System.out.println("전체 책의 합계 금액은 : " + totalPrice);
	}
}