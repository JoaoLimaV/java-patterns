package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class WidgetFactory {
	private static Map<String, Widget> pool = new HashMap<>();
		
	public static Widget getWidget(String name) {
		if(!pool.containsKey(name)) {
			pool.put(name, factory(name));
		}
		return pool.get(name);
	}

	private static Widget factory(String name) {
		switch (name) {
		case "clock": return new ClockWidget();
		default: throw new IllegalArgumentException("Unknown widget type");
		}
	}
}
