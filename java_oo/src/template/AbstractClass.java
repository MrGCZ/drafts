package template;
//ģ�巽������һ�������ж���һ���㷨�Ǽܣ�����һЩ�����ӳٵ�����ʵ�֡��������¶����㷨�е�ĳЩ���衣
public abstract class AbstractClass {
	final void templateMethod() {
		primitiveOperation1();
		primitiveOperation2();
		concreteOperation();
		hook();
	}
	
	abstract void primitiveOperation1(); //�������ʵ�֣��������в�ͬ��ʵ��
	
	abstract void primitiveOperation2();
	
	final void concreteOperation() {} //��������ʵ�֣������ǹ�ͬ��ʵ�֣��̳и���
	
	void hook() {} //���ӣ��������ʵ�֣�Ҳ���Բ�ʵ�֡�
	
}
