package behavioural.commandII;

public class App {
	public static void main(String[] args) {
		HouseLightApp lightApp = new HouseLightApp();
		
		
		System.out.println("Utilizando a classe Command");
		LightHouse lightRoom = new LightHouse("Quarto");
		CommandPowerLightHouse commandLightRoom = new CommandPowerLightHouse(lightRoom);
		commandLightRoom.execute();
		System.out.println("\n");
		
		
		System.out.println("Utilizando a classe invoker");
		LightHouse lightBathroom = new LightHouse("Banheiro");
		CommandPowerLightHouse commandLightBathroom = new CommandPowerLightHouse(lightBathroom);
		lightApp.addCommand("Ligar Luz", commandLightBathroom);
		lightApp.executeCommand();	
	}
}
