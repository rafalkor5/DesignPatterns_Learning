package Command.Workshop.Command;

public class RobotDrill implements Command{
    private Robot robot;

    public RobotDrill(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.off();
    }
}
