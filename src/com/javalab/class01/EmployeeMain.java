package com.javalab.class01;

/**
 * 실행클래스
 */
public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee[] emps = new Employee[10];
		emps[0] = new Employee("A", 28, 400, "KR", 10, "정규");
		emps[1] = new Employee("B", 27, 600, "KR", 15, "정규");
		emps[2] = new Employee("C", 26, 280, "JP", 1, "비정규");
		emps[3] = new Employee("D", 25, 360, "JP", 2, "비정규");
		emps[4] = new Employee("E", 23, 270, "RU", 1, "정규");
		emps[5] = new Employee("F", 27, 390, "AM", 4, "정규");
		emps[6] = new Employee("G", 31, 330, "SI", 3, "정규");
		emps[7] = new Employee("H", 35, 280, "CA", 2, "비정규");
		emps[8] = new Employee("I", 38, 450, "FR", 10, "정규");
		emps[9] = new Employee("J", 45, 600, "JP", 15, "정규");

		// 1. 배열을 받아서  전사원 목록을 출력해주는 메소드 생성
		System.out.println("1. 전 사원들의 목록");
		printEmployee(emps);
		System.out.println();		
		
		// 2. 정규직 평균급여를 구해주는 메소드 생성
		double avg = getSalAvg(emps);
		System.out.println("2. 정규직 직원들의 평균 급여는  : " + Math.round(avg * 100) / 100.0);
		System.out.println();

		// [문제.3]한국 사원들의 평균급여
		avg = 0.0; // 클리어
		avg = getKoreaAvg(emps);
		System.out.println("3. 한국 직원들의 평균 급여는  : " + Math.round(avg * 100) / 100.0);
	}

	// 전 사원의 목록 출력 메소드
	private static void printEmployee(Employee[] emps) {
		for (Employee employee : emps) {
			System.out.println(employee.getName() + "\t" + employee.getAge() + "\t" + employee.getSalary() + "\t"
					+ employee.getLocal() + "\t" + employee.getTerms() + "\t" + employee.getGubun());
		}		
	}


	// 정규직 평균급여를 구해주는 메소드 생성
	private static double getSalAvg(Employee[] emps) {
		int sum = 0;
		int count = 0;
		double salAvg = 0.0;
		for (Employee emp : emps) {
			if (emp.getGubun().equals("정규")) {
				sum += emp.getSalary();
				count++;
			}
		}
		salAvg = (double) sum / count;		
		return salAvg;
	}

	//한국 사원들의 평균급여
	private static double getKoreaAvg(Employee[] emps) {
		int sum = 0;
		double salAvg = 0.0;
		int count = 0;
		for (Employee emp : emps) {
			if (emp.getLocal().equals("KR")) {
				sum += emp.getSalary();
				count++;
			}
		}

		salAvg = (double) sum / count;
		return salAvg;
	}	
}
