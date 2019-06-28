/**
 * 
 */
package com.masterjavaonline.core.immutable;

/**
 * @author Master Java Online
 *
 */
public class Department implements Cloneable {

	private int dept_id;
	private String dept_name;

	/**
	 * @param dept_id
	 * @param dept_name
	 */
	public Department(int dept_id, String dept_name) {
		super();
		this.dept_id = dept_id;
		this.dept_name = dept_name;
	}

	/**
	 * 
	 */
	public Department() {
	}

	/**
	 * @return the dept_id
	 */
	public int getDept_id() {
		return dept_id;
	}

	/**
	 * @param dept_id the dept_id to set
	 */
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	/**
	 * @return the dept_name
	 */
	public String getDept_name() {
		return dept_name;
	}

	/**
	 * @param dept_name the dept_name to set
	 */
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public Department clone() throws CloneNotSupportedException {
		// Assign the shallow copy to new refernce variable t
		Department dept = (Department) super.clone();

		return dept;
	}

}
