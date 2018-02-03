package au.com.afl.exercise.service.impl;


import au.com.afl.exercise.service.Command;
import au.com.afl.exercise.service.CommandBuilder;
import au.com.afl.exercise.service.Operator;
import au.com.afl.exercise.service.impl.commands.BarCommand;
import au.com.afl.exercise.service.impl.commands.BazCommand;
import au.com.afl.exercise.service.impl.commands.FooCommand;
import au.com.afl.exercise.service.impl.operators.NumberDivisibleOperator;

import java.util.ArrayList;
import java.util.List;

public class DefaultCommandBuilder  implements CommandBuilder{
    @Override
    public List<Command> getCommands(int num) {

        List<Command> commands = new ArrayList<>();

        Operator divisibleBy3 = new NumberDivisibleOperator(num, 3);
        Operator divisibleBy5 = new NumberDivisibleOperator(num, 5);


        if ((Boolean) divisibleBy3.execute()) {
            Command foo = new FooCommand(num);
            commands.add(foo);
        }
        if ((Boolean) divisibleBy5.execute()) {
            Command bar = new BarCommand(num);
            commands.add(bar);
        }
        if ((Boolean) divisibleBy3.execute() && (Boolean) divisibleBy5.execute()) {
            Command baz = new BazCommand(num);
            commands = new ArrayList<>();
            commands.add(baz);
        }

        return commands;
    }
}
