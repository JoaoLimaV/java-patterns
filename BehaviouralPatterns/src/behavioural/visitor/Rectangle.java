package behavioural.visitor;

public class Rectangle implements Shape {
	private int id; 
	private int x;
	private int y;
	private int width;
	private int heigth;
	
	
	public Rectangle(int id, int x, int y, int width, int heigth) {
		this.id = id;
		this.x = x;
		this.y = y;
		this.width = width;
		this.heigth = heigth;
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String accept(Visitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}

	
	public int getId() {
		return id;
	}

	public int getX() {
		return x;
	}

	
	public int getY() {
		return y;
	}

	
	public int getWidth() {
		return width;
	}

	public int getHeigth() {
		return heigth;
	}
}
