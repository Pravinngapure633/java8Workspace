package FindMaximum2no;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class A {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(80);
		list.add(56);
		list.add(95);
		list.add(88);
		list.add(78);
		
	
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println("==========");
		list.stream().sorted(Comparator.reverseOrder()).skip(2).limit(1).forEach(System.out::println);
	
	}
}
