package State;

import State.CaffeMaker.CoffeMachine;

public class Main {
    public static void main(String[] args) {
        CoffeMachine coffeMachine = new CoffeMachine();

        coffeMachine.insertTheCoin();
        coffeMachine.returnTheCoin();
        coffeMachine.insertTheCoin();
        coffeMachine.pushTheButton();
        coffeMachine.takeTheCup();
        coffeMachine.pushTheButton();
    }
}
