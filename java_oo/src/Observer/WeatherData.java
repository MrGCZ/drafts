package Observer;
import java.util.ArrayList; 
//观察者模式：描述一个一对多的关系，其中一个消息源发散消息给各接收方，接收方订阅消息源。
//Observable被观察者：1.有订阅方法，用于存储observer观察者列表；2.有通知方法，遍历观察者列表，通知所有的观察者（调用观察者的update方法）。
//WeatherData为消息源 Subject 其实也就是 Observable被观察者

public class WeatherData implements Subject {
	private ArrayList observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList();
	}
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	//描述什么条件触发了则通知被观察者
	public void measurementsChanged() {
		notifyObserver();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();		
	}

	
}
