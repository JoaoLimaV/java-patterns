// Receiver 

package behavioural.commandII;

public class LightHouse {
	private boolean isOn;
	private String name; 
	
	public LightHouse(String name) {
		this.name = name;
	}
	
	public boolean powerOn(){
		this.isOn = true; 
		System.out.println("Ligando a luz do " + this.name);
		return this.isOn;
	}
	
	public boolean powerOff(){
		this.isOn = false; 
		System.out.println("Desligando a luz do " + this.name);
		return this.isOn;
	}

}
