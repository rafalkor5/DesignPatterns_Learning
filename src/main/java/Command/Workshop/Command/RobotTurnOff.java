package Command.Workshop.Command;

public class RobotTurnOff implements Command{
    private Robot robot;

    public RobotTurnOff(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.off();
    }
}

