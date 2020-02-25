package singleton;
//单件：只有一个实例，并提供全局访问点。

public class ChocolateRun {
	public static void main(String args[]) {
		ChocolateBoiler a = ChocolateBoiler.getInstance();
	}
}
