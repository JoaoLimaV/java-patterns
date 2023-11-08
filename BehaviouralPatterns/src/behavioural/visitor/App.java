package behavioural.visitor;

public class App {
	public static void main(String[] args) {
		Dot dot = new Dot(1, 10, 55);
		Circle circle = new Circle(2, 23, 15, 10);
		Rectangle rectangle = new Rectangle(3, 10, 177, 20, 10);
	
		CompoundShape c = new CompoundShape(5);
		c.add(dot);
		
		CompoundShape cs = new CompoundShape(4);
		cs.add(dot);
		cs.add(circle);
		cs.add(rectangle);
		cs.add(c);
		
		export(circle, rectangle, cs);
					
	}

	private static void export(Shape...shapes) {
		// TODO Auto-generated method stub
		XMLExportVisitor exportVisitor = new XMLExportVisitor();
		System.out.println(exportVisitor.export(shapes));
	}
}
