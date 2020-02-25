package order;

public class LightOffCommand implements Command {
	Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;  //封装接收者
	}
	
	public void execute() {
		light.off(); //封装请求接收者的动作 
	}
	
	public void undo() {
		light.on();
	}
}
