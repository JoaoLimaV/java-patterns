package behavioural.templatemethod;

public class App {
	public static void main(String[] args) {
		DataParser parser = new XMLParser();
		
		parser.path = "./data/template.html";
		parser.sanitize();
	}
}
