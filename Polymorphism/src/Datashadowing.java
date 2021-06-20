
 public class Datashadowing {
	
	 int Luckey = 8;   // Instance Variable
	 
	 void call() {
		 int Luckey = 7;         // Local Variable
		 
		 System.out.println("Calling :  "  +Luckey);          // Data Shadowing
	 }
	

	public static void main(String[] args) {
		Datashadowing  t = new Datashadowing();
		t.call();
		System.out.println("Call via Main  :   "  +t.Luckey);

	}

}
