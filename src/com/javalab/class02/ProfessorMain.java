package com.javalab.class02;

/**
 * 실행클래스
 * [Professor raw Data] 
		Professor professor1 = new Professor("92001", "590327-1839240", "이태규", 920, "교수", "1997");
		Professor professor2 = new Professor("92002", "690702-1350026", "고희석", 910, "부교수", "2003");
		Professor professor3 = new Professor("92301", "741011-2765501", "최성희", 910, "부교수", "2005");
		Professor professor4 = new Professor("92302", "750728-1102458", "김태석", 920, "교수", "1999");
		Professor professor5 = new Professor("92501", "620505-1200546", "박철재", 900, "조교수", "2007");
		Professor professor6 = new Professor("92502", "740101-1830264", "장민석", 910, "부교수", "2005");
 * 모듈화시 메소드에서 메소드 호출시 처리 흐름 설명
 * 
 */
public class ProfessorMain {

	public static void main(String[] args) {

		// ﻿6명의 교수 객체를 각각의 Professor type변수에 만드세요.
		Professor professor1 = new Professor("92001", "590327-1839240", "이태규", 920, "교수", "1997");
		Professor professor2 = new Professor("92002", "690702-1350026", "고희석", 910, "부교수", "2003");
		Professor professor3 = new Professor("92301", "741011-2765501", "최성희", 910, "부교수", "2005");
		Professor professor4 = new Professor("92302", "750728-1102458", "김태석", 920, "교수", "1999");
		Professor professor5 = new Professor("92501", "620505-1200546", "박철재", 900, "조교수", "2007");
		Professor professor6 = new Professor("92502", "740101-1830264", "장민석", 910, "부교수", "2005");

		// 교수 객체 저장용 객체 배열 생성
		Professor[] proArray = new Professor[6];
		proArray[0] = professor1;
		proArray[1] = professor2;
		proArray[2] = professor3;
		proArray[3] = professor4;
		proArray[4] = professor5;
		proArray[5] = professor6;

		// 교수 목록 출력하는 전용 메소드 호출
		printProfessor(proArray);

		// 910 학과 교수중 입사년도가 2005년인 교수를 찾아주는 메소드 호출
		getHireDate2005(proArray);

		// 주민번호가 590327-1839240인 이태규 교수가 퇴직했다.
		// 어제 입사한 선명규 교수를 그 자리에 저장하세요.(빈객체 생성후 setter 메소드로 값저장)
		// 선명규 교수 정보 : "96031", "790208-1884203", "선명규", 920, "부교수", "2021"
		newProfessor(proArray); // 이태규 -> 선명규 교수로 바꿔주는 메소드 호출
		
	}

	// 이태규 교수를 찾아서 새로운 교수로 변경(접근제한자 private -> public)
	private static void newProfessor(Professor[] proArray) {
		// 전체 배열에서 이태규 교수 찾기
		for (int i = 0; i < proArray.length; i++) {
			// 이태규 교수 객체이면
			if ((proArray[i].getJumin().equals("590327-1839240")) && (proArray[i].getName().equals("이태규"))) {
				// 새로운 교수 객체 생성
				Professor sun = new Professor();
				sun.setId("96031");
				sun.setJumin("790208-1884203");
				sun.setName("선명규");
				sun.setDepartment(920);
				sun.setGrade("부교수");
				sun.setHiredate("2021");
				// 기존 이태규 교수 자리에 새로운 선명규 교수 객체 저장
				proArray[i] = sun;
			}
		}
		
		// 바뀐 교수 명단 출력
		printProfessor(proArray);
	}

	// 910 학과 교수중 입사년도가 2005년인 교수 구하는 메소드
	private static void getHireDate2005(Professor[] proArray) {
		for (Professor professor : proArray) {
			if (professor.getDepartment() == 910 && professor.getHiredate().contains("2005")) {
				System.out.printf("%s  %s  %s  %d  %s  %s \n", professor.getId(), professor.getJumin(),
						professor.getName(), professor.getDepartment(), professor.getGrade(), professor.getHiredate());
			}
		}
		// 교수 명단 출력
		printProfessor(proArray);
	}

	// 교수 목록 출력 메소드
	private static void printProfessor(Professor[] proArray) {
		for (Professor professor : proArray) {
			System.out.println(professor.getId() + " " + professor.getName() + " " + professor.getJumin()
					+ professor.getDepartment() + " " + professor.getGrade() + " " + professor.getHiredate());
		}
		System.out.println();
	}
}