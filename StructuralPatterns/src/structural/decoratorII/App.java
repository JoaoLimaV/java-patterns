package structural.decoratorII;

public class App {
	public static void main(String[] args) {
		Camisa objCamisa = new Camisa(); 
		
		System.out.println("Objeto Camisa Preço: " + objCamisa.getPrice());
		
		DecoratorCamisa BordadaCamisa = new BordadaCamisaDecorator(objCamisa);
		
		System.out.println("Objeto Camisa Bordada Preço: " + BordadaCamisa.getPrice());
		
	}
}
