package structural.decoratorII;

public class BordadaCamisaDecorator extends DecoratorCamisa{
	private int BordadaCamisaPrice = 10;
	
	public BordadaCamisaDecorator(Camisa ComponentCamisa) {
		super(ComponentCamisa);
	}
	
	public int getPrice() {
		return this.ComponentCamisa.getPrice() + BordadaCamisaPrice;
	}

}
