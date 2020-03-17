package haapala.dakota.chapter6.project;

public class SimpleMath {
	
	public double divide(double numerator, double denominator) {
		if(denominator == 0) {
			throw new ArithmeticException("Cannot divide by 0");
		}
		double result = numerator/denominator;
		System.out.println(result);
		return result;
}
	
	
	public double multiply(double number1, double number2) {

		double result2 = number1 * number2;
		System.out.println(result2);
		return result2;
}


}

