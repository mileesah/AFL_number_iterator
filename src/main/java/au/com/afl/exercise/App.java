package au.com.afl.exercise;


import au.com.afl.exercise.service.Command;
import au.com.afl.exercise.service.CommandBuilder;
import au.com.afl.exercise.service.Iterator;
import au.com.afl.exercise.service.Operator;
import au.com.afl.exercise.service.impl.DefaultCommandBuilder;
import au.com.afl.exercise.service.impl.DefaultIterator;
import au.com.afl.exercise.service.impl.commands.BarCommand;
import au.com.afl.exercise.service.impl.commands.BazCommand;
import au.com.afl.exercise.service.impl.commands.FooCommand;
import au.com.afl.exercise.service.impl.operators.NumberDivisibleOperator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private Iterator iterator;
    private CommandBuilder commandBuilder;

    public App() {

    }

    public App(Iterator iterator, CommandBuilder commandBuilder) {
        this.iterator = iterator;
        this.commandBuilder = commandBuilder;
    }

    public void setIterator(Iterator iterator) {
        this.iterator = iterator;
    }

    public void setCommandBuilder(CommandBuilder commandBuilder) {
        this.commandBuilder = commandBuilder;
    }

    public static void main(String[] args) {

        /*
         * Retrieve input
         */
        System.out.println("This is a number iterator");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number greater than 0:");
        Integer upperLimit = 0;
        do {
            try {
                upperLimit = sc.nextInt();
            } catch (Exception e) {
                System.out.println("OOPS Invalid Number. Try Again...");
                sc.next();
            }
        } while (upperLimit <= 0);




        /* Assemble collection of numbers */
        List numberList = new ArrayList();

        for (int i = 0; i <= upperLimit; i++) {
            numberList.add(i);
        }

        /* Instantiate custom iterator */
        Iterator iterator = new DefaultIterator(numberList);

        /* Instantiate custom command builder */
        CommandBuilder commandBuilder = new DefaultCommandBuilder();

        App numberIterator = new App(iterator,commandBuilder);

        numberIterator.iterate();


    }


    public void iterate() {
        /* Iterate through the collection using the custom iterator */
        while (this.iterator.hasNext()) {
            Integer num = (Integer) iterator.next();
            /* Get list of commands to execute */
            List<Command> commands = this.commandBuilder.getCommands(num);
            for (Command command : commands) {
                //execute command
                command.execute();
            }

        }
    }


}
