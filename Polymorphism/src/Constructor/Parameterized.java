package Constructor;

public class Parameterized {
	
	int a, b;
	
	 //creating a parameterized constructor  
	public Parameterized(int a, int b) {
		
		this.a = a;
		this.b = b;
	}
	
	 //method to display the values  
	void add() {
		System.out.println("Addition ->"+(a+b));
	}

	public static void main(String[] args) {
		
		  //creating objects and passing values 
		Parameterized t1 = new Parameterized(20, 30);
		Parameterized t2 = new Parameterized(300, 200);
		
		//calling method to display the values of object 
		t1.add();
		t2.add();

	}

}
