package order;

public class LightOffCommand implements Command {
	Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;  //��װ������
	}
	
	public void execute() {
		light.off(); //��װ��������ߵĶ��� 
	}
	
	public void undo() {
		light.on();
	}
}
