package Command;

import Command.Workshop.Command.*;
import Command.Workshop.WorkshopApp;

public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot();
        CoffeMaker coffeMaker = new CoffeMaker();
        WorkshopApp workshopApp = new WorkshopApp();

        workshopApp.addToQuee(new RobotTurnOn(robot));
        workshopApp.addToQuee(new RobotCut(robot));
        workshopApp.addToQuee(new RobotDrill(robot));
        workshopApp.addToQuee(new RobotTurnOff(robot));
        workshopApp.addToQuee(new CoffeMakerOn(coffeMaker));
        workshopApp.addToQuee(new CoffeMakerOff(coffeMaker));
        workshopApp.run();
    }
}
