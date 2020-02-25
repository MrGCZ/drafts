package order;

public class RemoteControl {
	Command slot;
	
	public RemoteControl() {}
	
	public void setCommand(Command command) {
		slot = command;
	}
	
	public void exeWasPressed() {
		slot.execute();
	}
	
	public void undoWasPressed() {
		slot.undo();
	}
}
