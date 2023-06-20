package FindLargestSalaryInList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Test {
	
	public static void main(String[] args) {
		List<Employee> l=new ArrayList<Employee>();
		  l.add(new Employee(103, "Pravin", 15000.00));
		  l.add(new Employee(101, "saurabh", 100000.0));
		  l.add(new Employee(104, "Vishal", 18000.00));
		  
		   Optional<Double> d= l.stream().map(emp->emp.getSalary()).sorted(Comparator.reverseOrder()).findFirst();
		  System.out.println(d.get());
		  
		  System.out.println("=======================");
		  
		  //add salary+2000
		  l.stream().filter(emp->emp.getSalary()<20000)
		  .map(emp->{
			emp.setSalary((emp.getSalary()+(emp.getSalary()*0.2)));
			return emp;
		  }).forEach(System.out::println);;
		  
		  System.out.println("=============");
		  
		 //sorting with id
		  List<Employee> list = l.stream().sorted((e1,e2)->e1.getId().compareTo(e2.getId())).collect(Collectors.toList());
		  list.forEach(System.out::println);
		  
	}

}
// (20/100)*emp.getSalary()