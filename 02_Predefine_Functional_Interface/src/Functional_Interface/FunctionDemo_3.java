package Functional_Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo_3 {
	
	public static void main(String[] args) {
		
		List<Student> list=new ArrayList<Student>();
		
		list.add(new Student(101, "Virat", "Delhi"));
		list.add(new Student(102, "Rohit", "Mumbai"));
		list.add(new Student(103, "Dhooni", "Ranchi"));
		list.add(new Student(104, "Siraj", "Mumbai"));
		
		Function<Student, String> fun=stu->{
											if(stu.getAddress().equals("Mumbai"))
												return stu.getName();
											else
												return "";
										};
		List<String> stuName=new ArrayList<String>();
		
		for(Student stu:list)
		{
			String name = fun.apply(stu);
			stuName.add(name);
		}
		System.out.println(stuName);
		
		//Get name in aaray list
//		Function<Student, String> fun=stu->stu.getName();
//		
//		List<String> stuName=new ArrayList<String>();
//		
//		for(Student stu:list)
//		{
//			String name = fun.apply(stu);
//			stuName.add(name);
//		}
//		System.out.println(stuName);
//		
	}

}


class Student{
	
	private int rollno;
	private String name;
	private String address;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollno, String name, String address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}