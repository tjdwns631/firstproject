package com.yedam.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDAO {
	
	public void update(Employee emp) {
		Connection conn = DBConnection.getConnection();
		String sql = "update emp_temp set salary = " + emp.getSalary() +" where employee_id = " + emp.getEmployeeId();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			int r = pstmt.executeUpdate();
			System.out.println(r +" 업데이트 되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void removeEmployee(int empId){
		Connection conn = DBConnection.getConnection();
		String sql = "delete from emp_temp where employee_id =" + empId ;
	//	System.out.println(sql);
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			int r = pstmt.executeUpdate();
			System.out.println(r +" 삭제 되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void addEmployee(Employee emp) {
		Connection conn = DBConnection.getConnection();
		String sql = "insert into emp_temp(employee_id, last_name, email, hire_date, job_id ,salary)" 
		              + "values("
				+ emp.getEmployeeId() 
				+ ",\'" + emp.getLastName() 
				+ "\',\'" + emp.getEmail() 
				+ "\',\'" + emp.getHireDate() 
				+ "\',\'" + emp.getJobId() 
				+"\'," + emp.getSalary()
				+ ")";
	    System.out.println(sql);
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			int r = pstmt.executeUpdate();
			System.out.println(r +" 건 입력 되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
		
	public Employee[] getEmpList() {
		Connection conn = DBConnection.getConnection();
		Employee[] employees = new Employee[100];
		try {
			String sql = "select * from emp_temp";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			int idx = 0;
			while (rs.next()) {
				Employee emp = new Employee();
			    String firstName = rs.getString("first_name");
				emp.setFirstName(firstName);
				emp.setLastName(rs.getString("last_name"));
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setSalary(rs.getInt("salary"));
          
				employees[idx++] = emp;
			}
			System.out.println("-- end of data --");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employees;
	}

}


