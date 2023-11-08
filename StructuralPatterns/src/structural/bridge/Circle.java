package structural.bridge;

public class Circle extends Shape {

	public Circle(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String draw() {
		// TODO Auto-generated method stub
		return "Circle draw with " + color.fill();
	}
	
}
