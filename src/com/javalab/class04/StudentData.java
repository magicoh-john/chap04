package com.javalab.class04;

//데이터 저장 전담 클래스
public class StudentData {

	public Student[] students = new Student[8];

	public StudentData() {
		students[0] = new Student("1292001", "900424-1825409", "김광식", 3, "서울", 920);
		students[1] = new Student("1292002", "900305-2730021", "김정현", 3, "서울", 923);
		students[2] = new Student("1292003", "891021-2308302", "김현정", 4, "대전", 925);		
		students[3] = new Student("1292301", "880902-2704012", "김정숙", 2, "대구", 923);
		students[4] = new Student("1292303", "910715-1524390", "박광수", 3, "광주", 920);
		students[5] = new Student("1292305", "921011-1809003", "김우주", 4, "부산", 925);
		students[6] = new Student("1292501", "900825-1506390", "박철수", 3, "대전", 923);
		students[7] = new Student("1292502", "911011-1809003", "백태성", 3, "서울", 925);		
	}
}
