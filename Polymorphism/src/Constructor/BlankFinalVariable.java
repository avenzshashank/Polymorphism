// BLANK FINAL VARIABLE

package Constructor;

public class BlankFinalVariable {
	
	final int a;                                     // BLANK FINAL
	private BlankFinalVariable (int i) {
		a =i;
		
		
	}

	public static void main(String[] args) {
		BlankFinalVariable bfv = new BlankFinalVariable(10);
		System.out.println("Blank Final Variable :"+ bfv.a);

	}

}
