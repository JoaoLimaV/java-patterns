package behavioural.memento;

import java.awt.Color;

public class ColorCommand implements Command {
	private Editor editor; 
	private Color color;
	
	public ColorCommand(Editor editor, Color color) {
		// TODO Auto-generated constructor stub
		this.editor = editor;
		this.color = color;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Colorize: " + color.toString();
	}
	@Override
	public void execute() {
		for (Shape child : editor.getShapes().getSelected()) {
			child.setColor(color);
		}
		
	}
	
	
}
