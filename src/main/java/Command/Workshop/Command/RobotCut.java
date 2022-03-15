package Command.Workshop.Command;

public class RobotCut implements Command{
    private Robot robot;

    public RobotCut(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.cut();
    }
}
