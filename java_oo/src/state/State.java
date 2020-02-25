package state;
//状态接口，每个动作都对应一个方法
public abstract class State {
    public void insertQuarter(){
        System.out.println("Error!");
    };

    public void ejectQuarter(){
        System.out.println("Error!");
    };

    public void turnCrank(){
        System.out.println("Error!");
    };

    public void dispense(){
        System.out.println("Error!");
    };

}
