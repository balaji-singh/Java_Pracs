package com.masterjavaonline.core;

/**
 * @author Master Java Online
 *
 */
public class EmployeeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Department dept = new Department(100, "IT");
		Employee Employee = new Employee(1001, "Bala S Singh", dept);
		System.out.println("Employee Id:" + Employee.getEmp_id());
		System.out.println("Employee Name:" + Employee.getEmp_name());
		System.out.println("nEmployee Department ID:" + Employee.getDept().getDept_id());
		System.out.println(("Employee Department Name:" + Employee.getDept().getDept_name()));

		// changing Department values by using our immutable object
		Employee.getDept().setDept_id(101);
		Employee.getDept().setDept_name("Accounts");

		// Employee lost its immutable feature
		System.out.println("\nEmployee Id:" + Employee.getEmp_id());
		System.out.println("Employee Name:" + Employee.getEmp_name());
		System.out.println("nEmployee Department ID:" + Employee.getDept().getDept_id());
		System.out.println(("Employee Department Name:" + Employee.getDept().getDept_name()));

	}

}