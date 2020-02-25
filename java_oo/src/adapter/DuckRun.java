package adapter;

public class DuckRun {
	public static void main(String args[]) {
		MallardDuck duck = new MallardDuck();
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		duck.quack();
		turkey.gobble();
		turkeyAdapter.quack();
	}
}
