package Exception;

public class Exception {
	static void aE() {
		throw new ArithmeticException("dividing by zero");
	}
	public static void main(String[] args) {
		try {
			aE();
			throw new ArrayIndexOutOfBoundsException();
		}
		catch(ArithmeticException e1) {
			
			//System.out.println(e1.getMessage());
			e1.printStackTrace();
			
		}
		catch(ArrayIndexOutOfBoundsException e1) {
			e1.printStackTrace();
		}
	}
}
