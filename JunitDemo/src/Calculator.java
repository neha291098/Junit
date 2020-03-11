
public class Calculator {
	public double add(double a,double b) {
		return a+b;
	}
	public double subtract(double a,double b) {
		return a-b;
	}
	public double multiply(double a,double b) {
		return a*b;
	}
	public double divide(double a,double b) {
		if (b==0) {
			throw new ArithmeticException();
		}
		return a/b;
	}
	public static void main(String[] args) {
		Calculator c=new Calculator();
		System.out.println("addition of double (2+6) :"+c.add(2,6));
		System.out.println("subtract of double (6-2) :"+c.subtract(6, 2));
	}
}
