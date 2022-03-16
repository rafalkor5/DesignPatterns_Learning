package State.CaffeMaker;

interface State {
    void insertTheCoin(CoffeMachine coffeMachine);
    void pushTheButton(CoffeMachine coffeMachine);
    void takeTheCup(CoffeMachine coffeMachine);
    void returnTheCoin(CoffeMachine coffeMachine);
}
