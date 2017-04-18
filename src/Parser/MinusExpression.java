package Parser;

import Command.MinusCommand;
import Command.Command;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Tom on 08.04.2017.
 */
public class MinusExpression implements IExpression {
    private static final Pattern p = Pattern.compile("[-]([0-9]+)");
    private ArrayList<Command> commands = new ArrayList<>();

    public MinusExpression() {
        super();
    }

    @Override
    public ArrayList<Command> returnMatches(String input) {
        Matcher m = p.matcher(input);
        while (m.find()) {
            this.commands.add(new MinusCommand(-Integer.parseInt(m.group())));
        }
        return this.commands;
    }
}
