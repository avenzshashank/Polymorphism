package Constructor;

public class CopyConst {
	
	int  a, b;
	public CopyConst(int a, int b) {
		
		this.a = a;
		this.b = b;

	}
	
	public CopyConst(CopyConst c1) {
		
		this.a = c1.a;
		this.b = c1.b;
		
	}
	void add() {
		
		System.out.println("Adddition -> " +(a+b));
	}

	public static void main(String[] args) {
		
		CopyConst d1 = new CopyConst(10,20);
		CopyConst c2 = new CopyConst(d1);
		
		d1.add();
		c2.add();

	}

}
