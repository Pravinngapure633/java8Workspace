package Supplier;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {
	
	public static void main(String[] args) {
		
		Supplier<Integer> supply=()->new Random().nextInt();
	
				Integer num = supply.get();
				System.out.println(num);
	}

}
