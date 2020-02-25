package state;
//״̬ģʽ���������ڲ�ͬ��״̬���в�ͬ�Ķ����Ķ��󣬿��԰�״̬����װ����������ʵ��״̬ת�����Ͳ�ͬ״̬�µ��ò�ͬ������
public class GumballMachine {
    //�ǹ������ĸ�״̬������װ���ࡣ
    State noQuarterState;
    State hasQuarterState;
    State soldOutState;
    State soldState;

    int count = 0 ;
    State state = soldOutState;

    public GumballMachine(int numberGumballs){
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0){
            state = noQuarterState;
        }else{
            state = soldOutState;
        }


    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
    }

    void setState(State state){
        this.state = state;
    }

    public State getHasQuarterState(){
        return this.hasQuarterState;
    }

    public State getNoQuarterState(){
        return this.noQuarterState;
    }

    public State getSoldState(){
        return this.soldState;
    }

    public State getSoldeOutState(){
        return this.soldOutState;
    }



    void releaseBall(){
        System.out.println("release one ball");
        if (count != 0){
            count = count - 1;
        }
    }


}
