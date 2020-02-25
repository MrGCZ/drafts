package state;
//状态模式：适用于在不同的状态下有不同的动作的对象，可以把状态都封装起来。可以实现状态转换，和不同状态下调用不同动作。
public class GumballMachine {
    //糖果机有四个状态，都封装成类。
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
