package calculator;

public class Calc {
	public int add(int a1, int a2) {
		return a1+a2;
	}

	public int multiply(int a1, int a2) {
		return a1*a2;
	}

	public double divide(double a1, double a2) {
		if(a2==0)
		{
			throw new IllegalArgumentException("Number cannot be divided by zero");
		}
		return a1/a2;
	}
}
