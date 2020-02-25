package singleton;
//����ģʽ���ѳ�ʼ����������Ϊprivate��ͨ���෽��ʵ�ֳ�ʼ�����෽���涨ֻ�ܽ���ʵ����һ�Ρ�
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
