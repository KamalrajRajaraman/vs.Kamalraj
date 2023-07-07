package BasicArithmeticOperation;

public class BasicArithmeticOperations implements BasicAritmeticOperation{

	@Override
	public double addition(double num1, double num2) {
		//Perform Addition
		return num1+num2;
	}

	@Override
	public double subtraction(double num1, double num2) {
		//Perform Subtraction
		return num1-num2;
	}

	@Override
	public double multiplication(double num1, double num2) {
		//Perform Multiplication
		return num1*num2;
	}

	@Override
	public double division(double divident, double divisor) {
		//Perform Division
		return divident/divisor;
	}

	@Override
	public double powerCalculation(double base, double power) {
		//Perform Power Calculation
		double result=1.0;
		if(base==0)
			return 0;
		if(power==0)
			return result;
		while(power>0) {
			result = result*base;
			power--;
		}
		return result;
	}
	
}
