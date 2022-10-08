package exception.com;

public class ThrowKey {
	
	void div(int a, int b) throws ArithmeticException{
		if (b==0) {
			throw new ArithmeticException();
			
		}else {
			int c=a/b;
			System.out.println(c);
		}
	}
	
	public static void main(String[] args) {
		ThrowKey tt=new ThrowKey();
		try {
			tt.div(20, 0);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("The b Value is Zero");
		}
		
		
	}

}
