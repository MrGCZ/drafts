package order;
//����ģʽ����˼����ǰ��������������߷�װ������������ķ����ߣ������ߣ�ֻ��Ҫʵ������Ľӿڼ��ɡ�
public interface Command {
	public void execute();
	public void undo();
}
