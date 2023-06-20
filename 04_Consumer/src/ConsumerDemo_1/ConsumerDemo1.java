package ConsumerDemo_1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo1 {
	
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();

		list.add(new Student(101, "Virat", "Delhi"));
		list.add(new Student(102, "Rohit", "Mumbai"));
		list.add(new Student(103, "Dhooni", "Ranchi"));
		list.add(new Student(104, "Siraj", "Mumbai"));
		
		
		
//		Consumer<Student> con=stu->System.out.println(stu.getAddress());
//		
//		for(Student stu:list)
//		{
//			con.accept(stu);
//		}
		
		//Real time
		list.forEach(stu->System.out.println(stu.getAddress()));
	}
	

}

class Student {

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

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}
	

}
