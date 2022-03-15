package Command.Workshop;

import Command.Workshop.Command.Command;

import java.util.ArrayList;
import java.util.List;

public class WorkshopApp {
    private static List<Command> CommandQuee = new ArrayList<>();

    public void addToQuee(Command command){
        CommandQuee.add(command);
    }

    public void run(){
        if(CommandQuee.isEmpty()) System.out.println("Kolejka jest pusta");
        for (Command command: CommandQuee) {
            command.execute();
        }
        CommandQuee.clear();
    }

}
