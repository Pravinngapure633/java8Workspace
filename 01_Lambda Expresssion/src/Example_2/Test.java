package Example_2;

public class Test {

	public static void main(String[] args) {
		
		I i=new I() {
						public void add()
						{
							System.out.println("Add...Anonoymous");
						}
					};
					
					i.add();
	}
}
