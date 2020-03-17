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

}
