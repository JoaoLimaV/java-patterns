package behavioural.memento;

public class MoveCommand implements Command {
	private Editor editor;
	private int startX, startY;
	private int endX, endY;
	
	
	public MoveCommand(Editor editor) {
		this.editor = editor;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Move by X: " + (endX - startX) + "Y: " + (endY - startY);
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		for (Shape child : editor.getShapes().getSelected()) {
			child.moveBy(endX - startX, endY - startY);
		}
	}
	
	public void start(int x, int y) {
		this.startX = x;
		this.startY = y;
		
		for (Shape child : editor.getShapes().getSelected()) {
			child.drag();
		}
	}
	public void stop(int x, int y) {
		this.endX = x;
		this.endY = y;
		
		for (Shape child : editor.getShapes().getSelected()) {
			child.drop();
		}	
	}
	public void move(int x, int y) {
		for (Shape child : editor.getShapes().getSelected()) {
			child.moveTo(x - startX, y - startY);
		}	
	}

}
