package Parser;

/**
 * Created by Tom on 08.04.2017.
 */

import Command.Command;

import java.util.ArrayList;

public interface IExpression {
    public ArrayList<Command> returnMatches(String input);
}
