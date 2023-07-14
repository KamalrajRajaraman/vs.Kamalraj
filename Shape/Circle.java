package Shape;

public class Circle extends Shape{

	@Override
	public double calculateArea(double PI, double radius) {
		return 2*PI*radius*radius;
	}

}
