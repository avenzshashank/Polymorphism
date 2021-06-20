package Constructor;

public class Default {

	int a = 25;
	int b = 35;
	
	void show() {
		System.out.println("add :"+(a+b));
	}

	public static void main(String[] args) {
		Default def = new Default();
		def.show();
		System.out.println("Reference ID :"+def);      //call toString
		System.out.println("Hashcode :"+def.hashCode());
	}
		public Default() {
			// Super();
			System.out.println("Default Constructor...........");
		}

}
