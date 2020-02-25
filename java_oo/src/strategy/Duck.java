package strategy;
//˼�� ���仯֮�����룬����ӿڱ�̡� ��Ѽ�ӵķ�����Ϊͨ��������ʵ�֣���Ϊ��ͬ��Ѽ���в�ͬ�ķ�����Ϊ�������duck������ʵ����Ҫ���úܶ���롣���԰��ⲿ�ִ�duck���ʵ���а���������½�һ�����ӿڣ�
//������ר��ʵ��Ѽ�ӷ��е�ģʽ����duck����ֻ��Ҫ��������ʵ������������������ֻ��Ҫ����ʵ��������ͬ��ʵ�ַ�ʽ���������ã���
//����ģʽ������һ���㷨���壬������Щ�㷨���Ի�������Ϊÿһ���㷨������װ���������Կ��Կͻ��������׵�ʹ�ò�ͬ���㷨��ͨ��������ϵķ�ʽʵ�֡�
public abstract class Duck {
		FlyBehavior flyBehavior; //�������� 
		
		public Duck(){}
		
		public abstract void display();
		
		public void performFly() {
			flyBehavior.fly();
		}
		
		public void setFlyBehavior(FlyBehavior fb) {
			flyBehavior = fb;
		}
		
}
