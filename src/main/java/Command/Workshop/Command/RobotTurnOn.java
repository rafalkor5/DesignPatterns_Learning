package Command.Workshop.Command;

public class RobotTurnOn implements Command{
    private Robot robot;

    public RobotTurnOn(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.on();
    }
}
