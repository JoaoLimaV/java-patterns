package structural.flyweight;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Widget clockBC = WidgetFactory.getWidget("clock");
		clockBC.draw("blue", "center");
		
		Widget clockRL = WidgetFactory.getWidget("clock");
		clockBC.draw("blue", "center");
		
		Widget clockYR = WidgetFactory.getWidget("clock");
		clockBC.draw("yellow", "right");
		
		System.out.println("Number of clock" + ClockWidget.counter);
	}
}
