package com.javalab.class05;

/**
 * 학과클래스를 사용하는 실행클래스
 * 1. initData()메소드를 통해서 데이터 생성
 * 2. DepartmentData 클래스에서 데이터 생성작업 
 */
public class DepartmentMain {

	public static void main(String[] args) {

		//Department[] departments = new Department[3];
		// 기초데이터 생성
		//initData(departments);
		
		DepartmentData dd = new DepartmentData();
		Department[] departments = dd.departments;

		// [문제.1] 학과 목록을 출력하세요.
		printDepartment(departments);

		// [문제.2] 학과 코드(id)가 "923"인 학과의 코드(ID), name, office를 출력하시오.
		getDepartment(departments);

		// [문제.3] 컴퓨터공학과의 교실을 조회해서 main메소드에서 출력하세요.
		String office = getOffice(departments);
		System.out.println("컴퓨터공학과 교실은 : " + office + "입니다.");
	}

	// 학과 데이터 생성
	/*
	private static void initData(Department[] departments) {
		departments[0] = new Department(920, "컴퓨터공학과", "201호");
		departments[1] = new Department(923, "산업공학과", "207호");
		departments[2] = new Department(925, "전자공학과", "308호");		
	}
	*/	
	
	// 교실 조회 메소드
	private static String getOffice(Department[] departments) {
		String tempOffice = "";
		for (int i = 0; i < departments.length; i++) {
			if (departments[i].getName().equals("컴퓨터공학과")) {
				tempOffice = departments[i].getOffice();
			}
		}
		return tempOffice;
	}

	// 학과 코드로 학과명 조회
	private static void getDepartment(Department[] departments) {
		System.out.println("============== 학과 코드로 학과명 조회 =============");
		int tempId = 0;
		for (int i = 0; i < departments.length; i++) {
			tempId = departments[i].getId();
			if (tempId == 923) {
				System.out.println(departments[i].getId() + "\t" + departments[i].getName() + "\t" + departments[i].getOffice());
			}
		}		
		System.out.println();
	}

	// 학과 목록 출력
	private static void printDepartment(Department[] departments) {
		System.out.println("============== 학과 목록  ==============");
		for (int i = 0; i < departments.length; i++) {
			System.out.println(departments[i].getId() + "\t" + departments[i].getName() + "\t" + departments[i].getOffice());
		}		
		System.out.println();
	}


}
