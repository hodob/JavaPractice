package basic;

public class CH1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person rin = new Person();
		rin.hi(new Say() {
			
		};

	}

}

@FunctionalInterface
interface Say{
    int someting(int a,int b);
}
class Person{
    public void hi(Say line) {
	int number = line.someting(3,4);
	System.out.println("Number is "+number);
    }
}
