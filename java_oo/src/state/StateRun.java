package state;

public class StateRun {
    public static void main(String[] args){
        GumballMachine gumballMachine = new GumballMachine(10);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

    }
}
