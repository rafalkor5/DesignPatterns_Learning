package State.CaffeMaker;

class NoCoin implements State{

    @Override
    public void insertTheCoin(CoffeMachine coffeMachine) {
        System.out.println("Wrzucono Monete");
        coffeMachine.setState(new CoinInserted());
    }

    @Override
    public void pushTheButton(CoffeMachine coffeMachine) {
        System.out.println("Wrzuć monete");
    }

    @Override
    public void takeTheCup(CoffeMachine coffeMachine) {
        System.out.println("Wrzuć monete");
    }

    @Override
    public void returnTheCoin(CoffeMachine coffeMachine) {
        System.out.println("Wrzuć monete");
    }
}
