package Parser;

import Command.PlusCommand;
import Command.Command;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Tom on 08.04.2017.
 */
public class PlusExpression implements IExpression {
    private static final Pattern p = Pattern.compile("^\\d+|[+]([0-9]+)");
    private ArrayList<Command> commands = new ArrayList<>();

    public PlusExpression() {
        super();
    }

    @Override
    public ArrayList<Command> returnMatches(String input) {
        Matcher m = this.p.matcher(input);
        while (m.find()) {
            this.commands.add(new PlusCommand(Integer.parseInt(m.group())));
        }
        return this.commands;
    }
}
