package Observer;
//实例变量存储被观察者，好处是被观察者不用管那些观察者订阅了它。
public class CurrentConditionsDisplay implements Observer {
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData; //储存订阅的信息源
		weatherData.registerObserver(this); //初始化的过程中即订阅
	}
	
	@Override
	public void update(float temperature, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature = temperature;
		this.humidity = humidity;
		display();		
	}
	
	public void display() {
		System.out.println("Current conditions: temperature: "+temperature+"  ,humidity: "+humidity);
		
	}

}
