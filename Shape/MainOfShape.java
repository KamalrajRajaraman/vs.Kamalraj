package Shape;

public class MainOfShape {
	public static void main(String[] args) {
		Rectangle r1= new Rectangle();
		System.out.println("Area Of Rectangle : "+r1.calculateArea(5, 4));
		Circle c1 = new Circle();
		System.out.println("Area Of Circle :"+c1.calculateArea(3.14, 7));
	}
}
