package adapter;
//通过适配器，让Turkey实现Duck的接口
public class TurkeyAdapter implements Duck{
	Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;		
	}
	
	public void quack() {
		turkey.gobble();
	}
	
	public void fly() {
		turkey.fly();
	}
}
