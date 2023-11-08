package structural.flyweight;
public class ClockWidget extends Widget {
	
	public static int counter; // Só por teste
		
	
	public ClockWidget() {	
		super("clock", "code to create a clock");
		counter++;
	}

	@Override
	public void draw(String color, String position) {
		System.out.println("Drawing a block with" + color + "in" + position);

	}

}
