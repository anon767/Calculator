import Command.Calculator;
import Parser.Parser;
import Command.Command;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Tom on 13.12.2016.
 */
public class Main {
    private static void parseInput(String input) {
        Calculator c = new Calculator();
        Invoker i = new Invoker(c);
        Parser p = new Parser();
        ArrayList<Command> commands = p.parseInput(input);
        for (Command command : commands) {
            i.execute(command);
        }
        System.out.println(c.getResult());
    }

    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Calculate plus or minus:");
            String term = sc.nextLine();
            parseInput(term);
        }
    }
}
