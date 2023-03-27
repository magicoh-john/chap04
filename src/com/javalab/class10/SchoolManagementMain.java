package com.javalab.class10;

import com.javalab.class10.vo.Department;
import com.javalab.class10.vo.MakeData;
import com.javalab.class10.vo.Professor;
import com.javalab.class10.vo.Student;
import com.javalab.class10.vo.Takes;

/**
 * 학사 행정 실행클래스 - 특징으로는 두 개의 객체를 조인해서 결과를 뽑아낸다.(학생정보 + 학과정보)
 */
public class SchoolManagementMain {

	public static void main(String[] args) {

		MakeData md = new MakeData();
		Student[] students = md.students;
		Department[] departments = md.departments;
		Takes[] takes = md.takes;
		Professor[] professors = md.professors;
		
		/**
		 * [문제.1] 전체 학생 명단을 출력하되 학생의 소속 학과를 함께 출력하시오. - 학생(Student) 데이터와 학과(Department)
		 * 데이터를 함께 조회한다.
		 */
		System.out.println("======================== 1.학생 정보와  소속 학과명 ========================");

		int tempDeptId = 0;
		// String deptName = "";
		for (Student s : students) {
			tempDeptId = s.getDepartment(); // 학생의 학과 id
			for (Department d : departments) {
				if (tempDeptId == d.getId()) { // 학생의 학과 id와 학과 테이블의 학과 id 비교
					System.out.println(s.getId() + "\t " + s.getName() + "\t" + s.getJumin() + "\t" + s.getYear() + "\t"
							+ s.getAddress() + "\t" + s.getDepartment() + "\t" + d.getName());
				}
			}

		}
		System.out.println(); // 한줄을 띄는 용도

		/**
		 * [문제.2] 학생 데이터와 그 학생의 성적을 함께 출력하시오. - 학생(Student) + 성적(Takes)
		 */
		System.out.println("================ 2.학생(Student)정보 + 성적(Takes) ==================");
		System.out.println("학번 	 이름	  주민번호	 	학년 	주소 	학과번호 	과목코드	 성적");

		for (Student stu : students) {
			for (Takes tak : takes) {
				if (stu.getId().equals(tak.getId())) {
					System.out.println(stu.getId() + "\t " + stu.getName() + "\t" + stu.getJumin() + "\t"
							+ stu.getYear() + "\t" + stu.getAddress() + "\t" + stu.getDepartment() + "\t"
							+ tak.getSubject() + "\t" + tak.getScore());
				}
			}
		}

		/**
		 * [문제.3] 컴퓨터공학과 교수들을 모두 조회하세요.
		 */
		System.out.println("========= 교수중에서 컴퓨터공학과 교수들을 모두 조회하시오.==========");
		String searchDept = "컴퓨터공학과";
		int dId = 0; // 컴퓨터공학과의 id 저장용 변수
		for (Department dept : departments) {
			if (dept.getName().equals(searchDept)) {
				dId = dept.getId(); // 컴퓨터공학과의 id 추출
			}
		}
		for (Professor pro : professors) {
			if (pro.getDepartment() == dId) {
				System.out.println(pro.getId() + "\t" + pro.getJumin() + "\t" + pro.getName() + "\t"
						+ pro.getDepartment() + "\t" + searchDept);
			}
		}
		
		
		

	} // end main
}