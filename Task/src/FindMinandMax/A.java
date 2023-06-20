package FindMinandMax;

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
		
		Integer max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(max);
		
		Integer min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(min);
		
	}

}
