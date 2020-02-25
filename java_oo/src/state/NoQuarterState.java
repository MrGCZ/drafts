package state;
//每个状态类中封装了状态下的各种动作
public class NoQuarterState extends State {

    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine; //把糖果机的引用记录在实例变量中
    }

    public void insertQuarter(){
        System.out.println("You insert a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState()); //状态的转换在状态类中实现
    }



}
