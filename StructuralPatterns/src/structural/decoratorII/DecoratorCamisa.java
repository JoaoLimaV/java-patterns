package structural.decoratorII;

public class DecoratorCamisa implements CamisaProtocol{
	protected Camisa ComponentCamisa;

	public DecoratorCamisa(Camisa ComponentCamisa) {
		// TODO Auto-generated constructor stub
		this.ComponentCamisa = ComponentCamisa;
	}
	
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return ComponentCamisa.getPrice();
	}

}
