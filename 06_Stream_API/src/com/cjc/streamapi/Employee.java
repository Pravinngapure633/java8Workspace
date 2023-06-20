package com.cjc.streamapi;

public class Employee implements Comparable<Employee> {

	
	private int id;
	private String ename;
	private String desig;
	private double salary;
	private String dept;
	public Employee(int id, String ename, String desig, double salary, String dept) {
		super();
		this.id = id;
		this.ename = ename;
		this.desig = desig;
		this.salary = salary;
		this.dept = dept;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", desig=" + desig + ", salary=" + salary + ", dept=" + dept
				+ "]";
	}
	@Override
	public int compareTo(Employee emp) {
		
		return (int)-(this.salary-emp.salary);
	}
	
}
