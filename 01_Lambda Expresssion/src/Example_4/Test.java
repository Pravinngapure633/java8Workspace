package Example_4;

public class Test {

	public static void main(String[] args) {
		System.out.println("MAin Start");
		
		EvenOdd evenOdd=num->{
			if(num%2==0)
				System.out.println("number"+num+"is Even");
			else
				System.out.println("Number"+num+"is ood");
		};
		evenOdd.check(7);
	}

}
