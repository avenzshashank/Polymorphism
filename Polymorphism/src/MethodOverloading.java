// Method OverLoading Example here..........
public class MethodOverloading {

	void add(int a, int b) {
		System.out.println("int : " + (a + b));
	}

	void add(int a, double b) {
		System.out.println("int-double :" + (a + b));
	}

	void add(double a, double b) {
		System.out.println("Double :" + (a + b));
	}
	
	void add(int a, int b, int c) {
		System.out.println("3 int's :" +(a+b+c));
	}

	public static void main(String[] args) {
		
		MethodOverloading mov = new MethodOverloading();
		mov.add(20,30);
		mov.add(20,30.5);
		mov.add(20.6,30);
		mov.add(20,30,50);
		mov.add(20.4,30.6);

	}

}
