package order;

public class LightOnCommand implements Command {
	Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;  //封装接收者
	}
	
	public void execute() {
		light.on(); //封装请求接收者的动作 
	}
	
	public void undo() {
		light.off();
	}
}
