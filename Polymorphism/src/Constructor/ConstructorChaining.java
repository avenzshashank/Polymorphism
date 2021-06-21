// Constructor Chaining Rule :
// 1. If ther is no "Parent class" then Default Priority goes to "this" .
// 2. Constructors First Line is Reserved for "This/Super" .

package Constructor;

public class ConstructorChaining {
	
	int a, b;
	
	ConstructorChaining (int a, int b){
		System.out.println("double constructor :"+(a+b));
	}
	
	public ConstructorChaining(int a) {
		this(10,20);
		System.out.println("Single Constructor :"+a);
	}
	
	public ConstructorChaining() {
		this(10);                                    // Call ConstructorChaining (int a)
		System.out.println("Default Constructor.............");
		
	}
	public static void main(String[] args) {
		new ConstructorChaining();                    //annonymous Object

	}

}
