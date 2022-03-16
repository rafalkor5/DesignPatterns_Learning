package State.CaffeMaker;

class CupFull implements State{

    @Override
    public void insertTheCoin(CoffeMachine coffeMachine) {
        System.out.println("Zabierz kubek");
    }

    @Override
    public void pushTheButton(CoffeMachine coffeMachine) {
        System.out.println("Zabierz kubek");
    }

    @Override
    public void takeTheCup(CoffeMachine coffeMachine) {
        System.out.println("Kubek zabrano");
        coffeMachine.setState(new NoCoin());
    }

    @Override
    public void returnTheCoin(CoffeMachine coffeMachine) {
        System.out.println("Teraz to za pozno");
    }
}
