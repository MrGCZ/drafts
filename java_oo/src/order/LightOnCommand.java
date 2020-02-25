package order;

public class LightOnCommand implements Command {
	Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;  //��װ������
	}
	
	public void execute() {
		light.on(); //��װ��������ߵĶ��� 
	}
	
	public void undo() {
		light.off();
	}
}
