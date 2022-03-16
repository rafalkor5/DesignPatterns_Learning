package State.CaffeMaker;

class CoinInserted implements State{

    @Override
    public void insertTheCoin(CoffeMachine coffeMachine) {
        System.out.println("Moneta juz jest");
    }

    @Override
    public void pushTheButton(CoffeMachine coffeMachine) {
        System.out.println("Nalewam kawe");
        coffeMachine.setState(new CupFull());
    }

    @Override
    public void takeTheCup(CoffeMachine coffeMachine) {
        System.out.println("Wcisnij przycisk");
    }

    @Override
    public void returnTheCoin(CoffeMachine coffeMachine) {
        System.out.println("Zwrócono gruby hajs");
        coffeMachine.setState(new NoCoin());
    }
}
