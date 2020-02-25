package singleton;
//单件模式，把初始化方法设置为private，通过类方法实现初始化，类方法规定只能进行实例化一次。
public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private static ChocolateBoiler uniqueInstance;
	
	private ChocolateBoiler() {
		empty = true ;
		boiled = false;
		System.out.println("ChocolateBoiler is ready");
	}
	
	public static ChocolateBoiler getInstance(){
		if (uniqueInstance == null) {
			uniqueInstance = new ChocolateBoiler();
		}
		return uniqueInstance;
	}
}
