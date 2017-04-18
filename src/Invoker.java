import Command.Command;

import java.util.ArrayList;

import Command.Calculator;

/**
 * Created by Tom on 13.12.2016.
 */
public class Invoker {
    ArrayList<Command> commandHistory;
    Calculator calculator;

    public Invoker(Calculator c) {
        this.commandHistory = new ArrayList<>();
        this.calculator = c;
    }

    public void execute(Command c) {
        this.commandHistory.add(c);
        c.execute(this.calculator);
    }

    public void undo(Command c) {
        c.undo(this.calculator);
        this.commandHistory.remove(c);
    }

    public void removeAll() {
        for (Command c : this.commandHistory) {
            c.undo(this.calculator);
        }
        commandHistory.clear();
    }
}
