package Command.Workshop.Command;

public class CoffeMakerOn implements Command{
    private CoffeMaker coffeMaker;

    public CoffeMakerOn(CoffeMaker coffeMaker) {
        this.coffeMaker = coffeMaker;
    }

    @Override
    public void execute() {
        coffeMaker.On();
    }
}
