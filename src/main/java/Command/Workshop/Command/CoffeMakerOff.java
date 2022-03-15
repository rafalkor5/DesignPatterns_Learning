package Command.Workshop.Command;

public class CoffeMakerOff implements Command{
    private CoffeMaker coffeMaker;

    public CoffeMakerOff(CoffeMaker coffeMaker) {
        this.coffeMaker = coffeMaker;
    }

    @Override
    public void execute() {
        coffeMaker.Off();
    }
}
