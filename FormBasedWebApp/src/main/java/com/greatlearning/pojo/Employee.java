package com.greatlearning.pojo;

public class Employee {
	private String firstname;
	private String lasttname;
	private String department;
	private String[] technologies;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLasttname() {
		return lasttname;
	}

	public void setLasttname(String lasttname) {
		this.lasttname = lasttname;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String[] getTechnologies() {
		return technologies;
	}

	public void setTechnologies(String[] technologies) {
		this.technologies = technologies;
	}

}
