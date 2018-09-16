/**
 * 
 */
package com.masterjavaonline.core;

/**
 * @author Master Java Online
 *
 */
public class EmpDepartment extends Department {

	/**
	 * @param dept_id
	 * @param dept_name
	 */

	private int dept_id;
	private String dept_name;

	public EmpDepartment(int dept_id, String dept_name) {
		super(dept_id, dept_name);
		this.dept_id = dept_id;
		this.dept_name = dept_name;
	}

	/**
	 * @return the dept_id
	 */
	public int getDept_id() {
		return dept_id;
	}

	/**
	 * @param dept_id
	 *            the dept_id to set
	 */
	public void setDept_id(int dept_id) {
		throw new UnsupportedOperationException();
	}

	/**
	 * @return the dept_name
	 */
	public String getDept_name() {
		return dept_name;
	}

	/**
	 * @param dept_name
	 *            the dept_name to set
	 */
	public void setDept_name(String dept_name) {
		throw new UnsupportedOperationException();
	}

}
