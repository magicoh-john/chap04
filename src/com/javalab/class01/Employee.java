package com.javalab.class01;

/**
 * 사원 클래스
 * 다음 사원 데이터를 담을 수 있는 사원 클래스를 설계하세요(Employee)
 [사원 raw Data]
 ======================================================= 
    이름     		  나이     	      급여    		 지역   		 근무연수 		사원구분
 name   	age        salary      local        terms  		gubun 
 -------------------------------------------------------   
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
 =======================================================ㄴ 
 */

public class Employee {

	// 필드
	private String name;
	private int age;
	private int salary;
	private String local;
	private int terms;
	private String gubun;
	
	// 기본 생성자
	public Employee() {
	}

	// 오버로딩 생성자
	public Employee(String name, int age, int salary, String local, int terms, String gubun) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.local = local;
		this.terms = terms;
		this.gubun = gubun;
	}

	// 게터/세터 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public int getTerms() {
		return terms;
	}

	public void setTerms(int terms) {
		this.terms = terms;
	}

	public String getGubun() {
		return gubun;
	}

	public void setGubun(String gubun) {
		this.gubun = gubun;
	}

}
