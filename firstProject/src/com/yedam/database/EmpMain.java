package com.yedam.database;

import java.awt.event.InputMethodEvent;
import java.nio.InvalidMarkException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EmpMain {
	public static void main(String[] args) {
		boolean run = true;
		Scanner s = new Scanner(System.in);
		EmpService service = new EmpServiceImpl();
		while (run) {
			System.out.println("-------------------------------");
			System.out.println("1.리스트 2.입력 3.수정 4.삭제 9.종료");
			System.out.println("-------------------------------");
			System.out.print("선택 >");

			int selectNo = 0;

			try {
				selectNo = s.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력하시오.");
				s.nextLine();
				continue;

			}
			
			if (selectNo == 1) {
				System.out.println("------");
				System.out.println(" 리스트 ");
				System.out.println("------");

				service.showList(); // EmpDAO dao = new EmpDAO();
				// Employee[] emps = dao.getEmpList();
				for (Employee emp : service.showList()) {
					if (emp != null) {
						System.out.println(emp);
					}
				}
			} else if (selectNo == 2) {
				System.out.println("사원번호 입력 : ");
				int employee_id = s.nextInt();
				s.nextLine();
				System.out.println("이름 입력 : ");
				String last_name = s.nextLine();
				System.out.println("이메일 입력: ");
				String email = s.nextLine();
				System.out.println("입사일 입력 : ");
				String hire_data = s.nextLine();
				System.out.println("부서명 입력 : ");
				String job_id = s.nextLine();
				System.out.println("급여 입력 :");
				int salary = s.nextInt();
				// EmpDAO dao = new EmpDAO();
				Employee emp = new Employee(employee_id, last_name, email, hire_data, job_id, salary);
				service.addEmp(emp);// dao.addEmployee(emp);
			} else if (selectNo == 3) {
				System.out.print("변경할 사원번호입력.");
				int empid = s.nextInt();
				s.nextLine();
				System.out.println("변경할 연봉입력.");
				int salary = s.nextInt();
//            	EmpDAO dao = new EmpDAO();

				Employee emp = new Employee();
				emp.setSalary(salary);
				emp.setEmployeeId(empid);
				service.modEmp(emp);
				// dao.update(emp);

			} else if (selectNo == 4) {
				System.out.println("삭제할 사원번호를 입력하세요.");
				int empId = s.nextInt();
				s.nextLine();
				// EmpDAO dao = new EmpDAO();
				service.delEmp(empId);// dao.removeEmployee(i);
			} else if (selectNo == 9) {
				run = false;

			}

		}
		System.out.println("프로그램 종료.");
	}
}
