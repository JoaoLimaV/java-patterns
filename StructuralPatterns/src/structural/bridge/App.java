package structural.bridge;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape square = new Square(new Blue());
		String draw = square.draw();
		System.out.println(draw);
		
		Shape square2 = new Square(new Red());
		String draw2 = square2.draw();
		System.out.println(draw2);
		
		Shape  circle = new Circle(new Blue());
		String draw3 = circle.draw();
		System.out.println(draw3);
		
		Shape  circle2 = new Circle(new Red());
		String draw4 = circle2.draw();
		System.out.println(draw4);
	}

}
