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





        List numberList = new ArrayList();

        for (int i = 0; i <= upperLimit; i++) {
            numberList.add(i);
        }

        Iterator iterator = new DefaultIterator(numberList);
        CommandBuilder commandBuilder = new DefaultCommandBuilder();
        App numberIterator = new App(iterator,commandBuilder);


        numberIterator.iterate();


    }


    public void iterate() {
        while (this.iterator.hasNext()) {
            Integer num = (Integer) iterator.next();

            List<Command> commands = this.commandBuilder.getCommands(num);
            for (Command command : commands) {
                command.execute();
            }

        }
    }


}
