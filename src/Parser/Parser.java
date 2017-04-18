package Parser;

import java.util.ArrayList;

import Command.Command;

/**
 * Created by Tom on 08.04.2017.
 */
public class Parser {
    ArrayList<Command> commandQueue = new ArrayList<>();

    public ArrayList<Command> parseInput(String input) {
        MinusExpression minus = new MinusExpression();
        PlusExpression plus = new PlusExpression();
        commandQueue.addAll(plus.returnMatches(input));
        commandQueue.addAll(minus.returnMatches(input));
        return commandQueue;
    }
}
