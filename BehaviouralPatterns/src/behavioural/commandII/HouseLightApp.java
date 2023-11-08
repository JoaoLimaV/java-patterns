// invoker

package behavioural.commandII;

import java.util.List;

public class HouseLightApp {
	
	public String nameCommand;
	public CommandPowerLightHouse command;
	
	public void addCommand(String nameCommand, CommandPowerLightHouse command) {
		this.nameCommand = nameCommand;
		this.command = command;
	}
	
	public void executeCommand() {
		System.out.println("Executando o comando: " + nameCommand);
		this.command.execute();
	}
}
