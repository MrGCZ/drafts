package order;
//命令模式：其思想就是把命令和命令接收者封装起来。而命令的发出者（调用者）只需要实现命令的接口即可。
public interface Command {
	public void execute();
	public void undo();
}
