package BEHAVIOUR_DP.COMMAND_DP;

import java.util.ArrayList;
import java.util.List;

public class CommandLineRunner {
    List<Command> commands = new ArrayList<>();
    void addCommands(Command... commds) {
        for (Command comm : commds) {
            commands.add(comm);
        }
    }

    void executeCommands() {
        for(Command command : commands) {
            command.execute();
        }
    }
}
