package com.mdr.hibernate.entity;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
public class Employee 
{
	@Id
	@Column(name="empid")
	private int employeeId;
	
	@Column(name="ename")
	private String employeeName;

	private double salary;
	
	@Column(name="deptno")
	private int departmentNo;
	
	public Employee() { }

	public Employee(int employeeId, String employeeName, double salary, int departmentNo) 
	{
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.departmentNo = departmentNo;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getDepartmentNo() {
		return departmentNo;
	}

	public void setDepartmentNo(int departmentNo) {
		this.departmentNo = departmentNo;
	}
	
	
}
