package Observer;
//ʵ�������洢���۲��ߣ��ô��Ǳ��۲��߲��ù���Щ�۲��߶���������
public class CurrentConditionsDisplay implements Observer {
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData; //���涩�ĵ���ϢԴ
		weatherData.registerObserver(this); //��ʼ���Ĺ����м�����
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
