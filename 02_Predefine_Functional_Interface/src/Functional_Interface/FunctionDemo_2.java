package Functional_Interface;

import java.util.function.Function;

public class FunctionDemo_2 {
	
	public static void main(String[] args) {
		
		Function<String ,Integer> fun=str-> Integer.parseInt(str);
		Integer integer=fun.apply("123");
		System.out.println(integer);
	System.out.println("----------------");
	//2
	Function<Integer, Integer> fun1= num->num*num;
	
	Integer i = fun1.apply(5);
	System.out.println(i);
	//or
	Function<Integer, Integer> fun2= num->{System.out.println(num*num);
										return num;};
	
	
	
	}

}
