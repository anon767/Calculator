package Command;

/**
 * Created by Tom on 13.12.2016.
 */
public abstract class Command {
    protected int a;

    public Command(int a) {
        this.a = a;
    }

    public abstract void execute(Calculator c);

    public abstract void undo(Calculator c);
}
