package order;

public class CommandRun {
	public static void main(String args[]) {
		Light livingroomLight = new Light("Living room");
		Light restroomLight = new Light("Rest room");
		RemoteControl remoteControl1 = new RemoteControl();
		
		LightOnCommand lightOnCommandliv = new LightOnCommand(livingroomLight); //һ�������ߺ�һ�鶯������һ���㷨��
		LightOffCommand lightOffCommandliv = new LightOffCommand(livingroomLight);
		
		LightOnCommand lightOnCommandres = new LightOnCommand(restroomLight);
		LightOffCommand lightOffCommandres = new LightOffCommand(restroomLight);
		
		
		remoteControl1.setCommand(lightOnCommandliv);
		remoteControl1.exeWasPressed();
		remoteControl1.undoWasPressed();
		
		remoteControl1.setCommand(lightOffCommandliv);
		remoteControl1.exeWasPressed();
		
		remoteControl1.setCommand(lightOffCommandres);
		remoteControl1.exeWasPressed();
		
		
	}
}
