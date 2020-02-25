package state;
//ÿ��״̬���з�װ��״̬�µĸ��ֶ���
public class NoQuarterState extends State {

    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine; //���ǹ��������ü�¼��ʵ��������
    }

    public void insertQuarter(){
        System.out.println("You insert a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState()); //״̬��ת����״̬����ʵ��
    }



}
