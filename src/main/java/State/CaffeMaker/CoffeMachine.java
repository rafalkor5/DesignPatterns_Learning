package State.CaffeMaker;

public class CoffeMachine {

    private State state;

    public CoffeMachine() {
        this.state = new NoCoin();
    }

    public void insertTheCoin(){
       state.insertTheCoin(this);
    }
    public void pushTheButton(){
       state.pushTheButton(this);
    }
    public void takeTheCup(){
        state.takeTheCup(this);
    }
    public void returnTheCoin(){
       state.returnTheCoin(this);
    }

    void setState(State state) {
        this.state = state;
    }
}
