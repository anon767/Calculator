package Command;

import Command.Command;

/**
 * Created by Tom on 13.12.2016.
 */
public class MinusCommand extends Command {

    public MinusCommand(int a) {
        super(a);
    }

    public void execute(Calculator c) {
        c.minus(this.a);
    }

    public void undo(Calculator c) {
        c.plus(this.a);
    }
}
