package PredicateDemo;

import java.util.function.Predicate;

public class PredicateDemo_1 {

	public static void main(String[] args) {
	
	//Predicate<Integer> checkEvenOdd=(Integer num)->num%2==0;
		//Or
		Predicate<Integer> checkEvenOdd= num ->num%2==0;
	
		int x=9;
		
		
		if(checkEvenOdd.test(x))
			System.out.println("Number is Even:"+x);
		else
			System.out.println("Number is Odd");
	}
	
}
