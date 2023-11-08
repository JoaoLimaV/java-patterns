package behavioural.visitor;

import java.util.List;
import java.util.ArrayList;

public class CompoundShape implements Shape {
	private List<Shape> children = new ArrayList<>();
	private int id; 

	public CompoundShape(int id) {

		this.id = id;
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
	
	public List<Shape> getChildren(){
		return this.children;
	}
	
	public void add (Shape shape) {
		children.add(shape);
	}
	
	public int getId() {
		return id;
	}
}
