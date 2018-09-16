package com.masterjavaonline.core.immutable;

/*
 * @author Master Java Online *
 */
// An immutable class 
public class Employee {

	private final String emp_name;
	private final int emp_id;
	private final Department dept;

	/**
	 * @param emp_id
	 * @param emp_name
	 */
	public Employee(int emp_id, String emp_name, Department dept) {
		super();
		this.emp_name = emp_name;
		this.emp_id = emp_id;
		this.dept = dept;

	}

	/**
	 * @return the emp_name
	 */
	public String getEmp_name() {
		return emp_name;
	}

	/**
	 * @return the emp_id
	 */
	public int getEmp_id() {
		return emp_id;
	}

	/**
	 * @return the dept
	 */
	public Department getDept() {

		Department dept = new Department();
		dept.setDept_id(this.dept.getDept_id());
		dept.setDept_name(this.dept.getDept_name());

		/*try {
			return dept.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		return dept;
	}

}