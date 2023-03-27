package com.javalab.class08;

public class ProductMain {

	public static void main(String[] args) {

		// 데이터를 생성해주는 객체 생성
		ProductData pd = new ProductData(); // Product 객체 10개 담을 수 있는 배열 선언하고 그 배열에 객를 만들어서 넣음
		Product[] products = pd.products;

		// [문제.1] 전체 상품 목록 출력
		printProduct(products);

		/**
		 * [문제.2] 세탁기의 가격을 조회하시오.
		 */
		String tempStr = "세탁기";
		getWashPrice(tempStr, products);

		/**
		 * [문제.3] 구매한 모든 제품의 총액과 평균 가격을 main메소드에서 출력하세요.
		 */
		int sum = getTotalAmount(products);
		double avg = getAvg(products);
		System.out.printf("구매하신 제품의 총액은 %d 원이며 평균 구매 가격은 %.2f 원입니다.\n", sum, avg);
		System.out.println("");

		/*
		 * [문제.4] 제품 중에서 100만원 이상 제품의 목록, 수량, 합계 금액 출력
		 */
		getProductGrather100(products);
	}

	// 제품 중에서 100만원 이상 제품의 목록, 수량, 합계 금액 출력
	private static void getProductGrather100(Product[] pds) {
		int count = 0;
		int sum = 0;
		System.out.println("가격이 100만원 이상인 제품은 다음과 같습니다.\n");
		for (int i = 0; i < pds.length; i++) {
			if (pds[i].getPrice() >= 1000000) {
				System.out.println("--------------------------------------------------------");
				System.out.println(pds[i].getId() + "\t" + pds[i].getName() + "\t" + pds[i].getPrice());
				sum += pds[i].getPrice(); // 100만원이 넘는 구매 제품의 금액 합산
				count++; // 100만원 넘는 구매 제품 갯수 합산
			}
		}
		System.out.println("100만원 이상인 제품의 수량은 : " + count + "개 이며 합계 금액은 : " + sum + "입니다.");		
	}

	// 평균 구하는 메소드
	private static double getAvg(Product[] pds) {
		int sum = 0;
		double avg = 0.0;
		for (int i = 0; i < pds.length; i++) {
			sum = sum + pds[i].getPrice();
		}
		avg = (sum * 1.0) / pds.length;
		return avg;
	}

	// 합계 금액 구하는 메소드
	private static int getTotalAmount(Product[] pds) {
		int sum = 0;
		for (int i = 0; i < pds.length; i++) {
			sum = sum + pds[i].getPrice();
		}
		return sum;
	}

	// 세탁기 가격 구하는 메소드(제품명을 파라미터로 받고 있음)
	private static void getWashPrice(String tempStr, Product[] products) {
		int tempPrice = 0;
		for (Product p : products) {
			if (p.getName().equals(tempStr)) {
				tempPrice = p.getPrice();
			}
		}
		System.out.println("2. " + tempStr + " 제품의 가격은 " + tempPrice + "원입니다.");
		System.out.println("");		
	}

	// 상품 목록 출력 메소드
	private static void printProduct(Product[] products) {
		for (Product product : products) {
			System.out.println(product.getId() + "\t" + product.getName() + "\t" + product.getPrice());
		}
		System.out.println();		
	}
}
